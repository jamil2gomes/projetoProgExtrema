package br.com.ifma.principal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifma.principal.model.Banca;

@Repository
public interface BancaRepository extends JpaRepository<Banca, Long>{

}
