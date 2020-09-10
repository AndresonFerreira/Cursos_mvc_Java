package br.sp.gov.etec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.etec.dto.AlunoDto;
import br.sp.gov.etec.entity.Aluno;
import br.sp.gov.etec.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository repository;
	

	public Aluno cadastrarAluno(AlunoDto dto) {
		Aluno aluno = repository.save(dto.toEntityAluno());
		return aluno;
	}
	
	public List<Aluno> listarAluno(){
		List<Aluno> aluno = repository.findAll();
		return aluno;	
	}
}
