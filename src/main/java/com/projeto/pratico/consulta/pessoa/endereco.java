package com.projeto.pratico.consulta.pessoa;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class endereco {

		

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String logradouro;
	
	
	
	
	@Column(nullable = false)
	private String barrio;
	
	
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String cep;
}

