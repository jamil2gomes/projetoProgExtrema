package br.com.ifma.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifma.principal.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	


}
