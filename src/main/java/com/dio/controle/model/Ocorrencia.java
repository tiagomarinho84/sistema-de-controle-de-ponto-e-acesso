package com.dio.controle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ocorrencia {
	
	private Long id;
	private String nome;
	private String descricao;
}
