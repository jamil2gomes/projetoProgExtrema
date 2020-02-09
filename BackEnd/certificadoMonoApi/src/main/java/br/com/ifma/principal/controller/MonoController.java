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
	
	@GetMapping("/{tema}")
	public ResponseEntity<Monografia>buscaMonoPor(@PathVariable String tema){
		
		return ResponseEntity.ok()
				.header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("crossDomain", "true")
	            .body(monoService.buscaPor(tema));
	}
}
