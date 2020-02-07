package br.com.ifma.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifma.principal.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
