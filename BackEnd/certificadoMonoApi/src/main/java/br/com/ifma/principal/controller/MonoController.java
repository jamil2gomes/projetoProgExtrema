package br.com.ifma.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifma.principal.model.Monografia;
import br.com.ifma.principal.service.MonografiaService;

@RestController
@RequestMapping("/mono")
public class MonoController {

	@Autowired
	private MonografiaService monoService;
	
	@GetMapping("/{aluno}/{tema}")
	public ResponseEntity<Monografia>buscaMonoPor(@PathVariable String aluno, @PathVariable String tema){
		return ResponseEntity.ok().body(monoService.buscaPor(aluno, tema));
	}
}
