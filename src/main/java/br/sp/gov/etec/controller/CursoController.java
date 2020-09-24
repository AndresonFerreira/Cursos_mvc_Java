package br.sp.gov.etec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.dto.CursoDto;
import br.sp.gov.etec.entity.Curso;
import br.sp.gov.etec.entity.Escola;
import br.sp.gov.etec.service.CursoService;
import br.sp.gov.etec.util.Mensagem;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
	
	@Autowired
	CursoService service;
	
	@PostMapping
	public ResponseEntity<?> cadastrarCurso(@RequestBody CursoDto dto){
		Curso curso = service.cadastrarCurso(dto);
		return ResponseEntity.status(HttpStatus.OK).body(curso); 
	}
	
	
	@GetMapping
	public ResponseEntity<?> listarCurso(){
		List<Curso> cursos = service.listarCursos();
		return ResponseEntity.status(HttpStatus.OK).body(cursos); 
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> consultarIdCurso(@PathVariable(value = "id") long id){
		Curso cursos = service.procurarPorIdCurso(id);
		return ResponseEntity.status(HttpStatus.OK).body(cursos); 
	}
	
	@DeleteMapping
	public ResponseEntity<?> deletarCurso(@RequestBody Curso curso){
		service.deletarCurso(curso);
		Mensagem msg = new Mensagem();
		msg.setCodRetorno(HttpStatus.OK.toString());
		msg.setMsg(curso.toString());
		return  ResponseEntity.status(HttpStatus.OK).body(msg);
	}
	
	@PutMapping
	public ResponseEntity<?> atualizarCurso(@RequestBody Curso curso){
		Curso retorno = service.atualizarCurso(curso);
		return ResponseEntity.status(HttpStatus.OK).body(retorno);
	}
}
