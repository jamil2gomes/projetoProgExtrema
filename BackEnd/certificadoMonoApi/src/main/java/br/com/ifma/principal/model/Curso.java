package br.com.ifma.principal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String nome;
	
	@JsonIgnore @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<>();
	
	public Curso() {}

	public Curso(String nome) {this.nome = nome;}

	public Integer getId() {return id;}

	public String getNome() {return nome;}
	
	public void adicionaAluno(Aluno aluno) {this.alunos.add(aluno);	}

	public void setNome(String nome) {this.nome = nome;}

	@Override
	public int hashCode() {return Objects.hash(id, nome);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
			
}
