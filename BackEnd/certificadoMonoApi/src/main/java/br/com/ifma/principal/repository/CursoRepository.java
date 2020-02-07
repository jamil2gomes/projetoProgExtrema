package br.com.ifma.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifma.principal.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
