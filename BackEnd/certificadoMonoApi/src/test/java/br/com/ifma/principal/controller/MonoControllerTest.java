package br.com.ifma.principal.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ifma.principal.service.MonografiaService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = MonoController.class)
public class MonoControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private MonografiaService service;
	
	@Autowired
    private ObjectMapper objectMapper;
	
	@Test
	public void deveRetornarInformacoesDaMonoDadoAlunoETema() {
		
	}

}
