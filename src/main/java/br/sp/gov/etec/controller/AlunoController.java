package br.sp.gov.etec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.dto.AlunoDto;
import br.sp.gov.etec.entity.Aluno;
import br.sp.gov.etec.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

	
	@Autowired
	AlunoService service;
	
	@PostMapping
	public ResponseEntity<?> cadastrarAluno(@RequestBody AlunoDto dto){
		Aluno aluno = service.cadastrarAluno(dto);
		return ResponseEntity.status(HttpStatus.OK).body(aluno); 
	}
	
	
	@GetMapping
	public ResponseEntity<?> listarAlunos(){
		List<Aluno> alunos = service.listarAluno();
		return ResponseEntity.status(HttpStatus.OK).body(alunos); 
	}
	
}
