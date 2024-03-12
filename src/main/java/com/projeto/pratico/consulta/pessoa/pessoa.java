package com.projeto.pratico.consulta.pessoa;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	
	private String rg;
	
	@Column(nullable = false)
	private String cpf;
	
	
	@Column(nullable = false)
	private Date data_nascimento;
	
	@Column(nullable = false)
	private String nome_mae;
	
	@Column(nullable = false)
	private String nome_pai;
	
	
	
	@Column(updatable = false)
    @Data_Cadastro
	private Date data_cadastro;



	public long getId() {
		return id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pessoa other = (pessoa) obj;
		return id == other.id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public Date getData_nascimento() {
		return data_nascimento;
	}



	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}



	public String getNome_mae() {
		return nome_mae;
	}



	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}



	public String getNome_pai() {
		return nome_pai;
	}



	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}



	public Date getData_cadastro() {
		return data_cadastro;
	}



	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	} 
	
	
	
}
