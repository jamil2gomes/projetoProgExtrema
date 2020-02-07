package br.com.ifma.principal.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Monografia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tema;
	
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private LocalDateTime dataDefesa;
	
	private String local;
	
	@Enumerated(EnumType.STRING)
	private Situacao situacao;
	
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "monografia")
	private Banca banca;
	
	public Monografia() {}

	public Monografia(String tema, LocalDateTime dataDefesa, Aluno aluno, String local, Situacao situacao) {
		this.tema       = tema;
		this.dataDefesa = dataDefesa;
		this.aluno      = aluno;
		this.local      = local;
		this.situacao   = situacao;
	}

	public Banca getBanca() {return banca;}
	
	public void setBanca(Banca banca) {this.banca = banca;}
	
	public Long getId() {return id;}

    public String getLocal() {return this.local;}
    
    public void setLocal(String local) {this.local = local;}
    
	public String getTema() {return tema;}

	public void setTema(String tema) {this.tema = tema;}
	
	public Situacao getSituacao() {return situacao;}
	
	public void setSituacao(Situacao situacao) {this.situacao = situacao;}

	public LocalDateTime getDataDefesa() {return dataDefesa;}

	public void setDataDefesa(LocalDateTime dataDefesa) {this.dataDefesa = dataDefesa;}
	
	public Aluno getAluno() {return aluno;}

	public void setAluno(Aluno aluno) {this.aluno = aluno;}

	@Override
	public int hashCode() {return Objects.hash(id, tema);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monografia other = (Monografia) obj;
		return Objects.equals(id, other.id) && Objects.equals(tema, other.tema);
	}
	
	
	
	
	
	

}
