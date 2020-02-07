package br.com.ifma.principal.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	private String nome;
	
	@JsonIgnore@ManyToOne @JoinColumn(name = "curso_id")
	private Curso curso;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "aluno")
	private Monografia monografia;
		
	
	public Aluno() {}

	public Aluno(String nome, Curso curso) {
		this.nome  = nome;
		this.curso = curso;
	}

	public Monografia getMonografia() {return monografia;}
	
	public void setMonografia(Monografia monografia) {this.monografia = monografia;}
	
	public Integer getId() {return id;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public Curso getCurso() {return curso;}

	public void setCurso(Curso curso) {this.curso = curso;}

	@Override
	public int hashCode() {return Objects.hash(curso, id);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Objects.equals(id, other.id);
	}
}
