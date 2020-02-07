package br.com.ifma.principal.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "professor_banca")
public class ProfessorBanca implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	private ProfessorBancaPK id = new ProfessorBancaPK();
	@Min(value = 0)
	private double nota;
	@NotNull
	private boolean orientador;
	
public ProfessorBanca() {}
	
    
    
    public ProfessorBanca(Professor professor, Banca banca, double d, boolean orientador) {
		
		id.setBanca(banca);
		id.setProfessor(professor);
		this.nota = d;
		this.orientador = orientador;
	}



	private Professor getProfessor() {return id.getProfessor();}
    
	@JsonIgnore
    private Banca getBanca() { return id.getBanca();}
    
    public ProfessorBancaPK getId() {return id;}
    
    public void setId(ProfessorBancaPK id) {this.id = id;}
    
    public double getNota() {return nota;}
    
    public void setNota(double nota) {this.nota = nota;}
    
    public Boolean getOrientador() {return orientador;}
    
    public void setOrientador(Boolean orientador) {this.orientador = orientador;}

	@Override
	public int hashCode() {return Objects.hash(id);}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorBanca other = (ProfessorBanca) obj;
		return Objects.equals(id, other.id);
	}
    
	   
}
