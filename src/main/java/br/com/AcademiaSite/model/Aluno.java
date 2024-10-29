package br.com.AcademiaSite.model;

import javax.validation.constraints.Size;

import br.com.AcademiaSite.Enums.Planos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // diz que essa classe é um obj aluno;
public class Aluno {
	
	@Id // primary key;
	@GeneratedValue(strategy = GenerationType.AUTO) // auto incremento;
	private Integer id;
	
	@Column(name = "nome") // qual nome vai ser lá no banco
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "cpf", length = 11)
	@Size(min = 11, max = 11)
	private String cpf;
	
	@Column(name = "plano")
	@Enumerated(EnumType.STRING)
	private Planos plano;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Planos getPlano() {
		return plano;
	}

	public void setPlano(Planos plano) {
		this.plano = plano;
	}
	
	public String getNumero() {
	    return numero;
	}

	public void setNumero(String numero) {
	    this.numero = numero;
	}
}
