package br.com.ifma.principal.config;

//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import br.com.ifma.principal.model.Aluno;
//import br.com.ifma.principal.model.Curso;
//import br.com.ifma.principal.model.Professor;
//import br.com.ifma.principal.repository.AlunoRepository;
//import br.com.ifma.principal.repository.CursoRepository;
//import br.com.ifma.principal.repository.ProfessorRepository;
//
//@Configuration
//public class Seeder implements CommandLineRunner {
//
//	@Autowired
//	private AlunoRepository alunoRepo;
//	
//	@Autowired
//	private CursoRepository cursoRepo;
//	
//	
//	@Autowired
//	private ProfessorRepository profRepo;
//	
//
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Curso curso  = new Curso("Sistemas de Informação");
//		cursoRepo.save(curso);
//		
//		Aluno pedro = new Aluno("Pedro Silva", curso);
//		alunoRepo.save(pedro);
//		
//		
//		
//			
//		Professor profJoao = new Professor("Joao");
//		Professor profMauro = new Professor("Mauro");
//		Professor profEveline = new Professor("Eveline");
//		profRepo.saveAll(Arrays.asList(profEveline, profJoao, profMauro));
//		
//	}
//
//}
