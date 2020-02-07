package br.com.ifma.principal.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class ProfessorBancaPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "banca_id")
	private Banca banca;

	public Professor getProfessor() {return professor;}

	public void setProfessor(Professor professor) {this.professor = professor;}

	public Banca getBanca() {return banca;}

	public void setBanca(Banca banca) {this.banca = banca;}

	@Override
	public int hashCode() {return Objects.hash(banca, professor);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorBancaPK other = (ProfessorBancaPK) obj;
		return Objects.equals(banca, other.banca) && Objects.equals(professor, other.professor);
	}
	
	
	
	
	
	

}
