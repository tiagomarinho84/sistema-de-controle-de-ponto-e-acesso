package com.dio.controle.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {

	private Long id;
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	@ManyToOne
	private Empresa empresa;
	@ManyToOne
	private NivelAcesso nivelAcesso;
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	private String nome;	
	private BigDecimal tolerancia;
	private LocalDateTime finalJornada;

}
