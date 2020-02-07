package br.com.ifma.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.ifma.principal.model.Monografia;

@Repository
public interface MonografiaRepository extends JpaRepository<Monografia, Long> {

	//PEGA A DATA, LOCAL, TEMA, SITUACAO E NOME DO ALUNO
	@Query(value = "FROM Monografia m INNER JOIN m.aluno a "
			+ "WHERE m.situacao = 'APROVADO' "
			+ "AND a.nome = ?1 "
			+ "AND m.tema = ?2")
	 Monografia encontraMonoPor(String nomeAluno, String tema);
}
