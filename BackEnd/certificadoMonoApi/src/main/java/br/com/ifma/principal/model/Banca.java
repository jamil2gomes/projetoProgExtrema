package br.com.ifma.principal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "banca")
public class Banca implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFormacao;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "monografia_id")
	private Monografia monografia;
	
	@OneToMany(mappedBy = "id.banca")
	private List<ProfessorBanca> bancaProfessor = new ArrayList<>();
	
	
	public Banca() {}

	public Banca(LocalDate dataFormacao, Monografia monografia) {
		this.dataFormacao = dataFormacao;
		this.monografia   = monografia;
	}
	
	public List<ProfessorBanca> getBancaProfessor() {return bancaProfessor;}

	public Integer getId() {return id;}

	public LocalDate getDataFormacao() {return dataFormacao;}

	public void setDataFormacao(LocalDate dataFormacao) {this.dataFormacao = dataFormacao;}

	public Monografia getMonografia() {return monografia;}

	public void setMonografia(Monografia monografia) {this.monografia = monografia;}

	@Override
	public int hashCode() {return Objects.hash(id, monografia);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banca other = (Banca) obj;
		return Objects.equals(id, other.id) && Objects.equals(monografia, other.monografia);
	}
}
