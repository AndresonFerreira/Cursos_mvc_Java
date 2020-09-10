package br.sp.gov.etec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "tb_aluno")


public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	@Column(name = "nome")
	private String nome;
		
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "data_nadc")
	private String data_nasc;
	
	
	public Aluno() {}
	
	public Aluno(String nome, String rg, String cpf, String matricula, String email, String data_nasc) {
		this.nome = nome;
		this.rg =rg;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.data_nasc = data_nasc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
	

	 

}
