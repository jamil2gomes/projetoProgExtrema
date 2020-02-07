package br.com.ifma.principal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifma.principal.model.Monografia;
import br.com.ifma.principal.repository.MonografiaRepository;

@Service
public class MonografiaService {
	
	@Autowired
	private MonografiaRepository monoRepository;
	
	public Monografia buscaPor(String aluno, String tema) {
		return monoRepository.encontraMonoPor(aluno, tema);
	}

}
