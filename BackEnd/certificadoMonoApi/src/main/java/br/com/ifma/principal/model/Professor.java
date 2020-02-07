package br.com.ifma.principal.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;


@Entity
@Table(name = "professor")
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String nome;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id.professor")
	private List<ProfessorBanca> professorBanca = new ArrayList<>();
	
	public Professor() {}
	
	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}
	
	public Integer getId() {return id;}
	
	public List<ProfessorBanca> getProfessorBanca() {return professorBanca;}

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
		Professor other = (Professor) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

}
