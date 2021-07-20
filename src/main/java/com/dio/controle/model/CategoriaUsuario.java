package com.dio.controle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoriaUsuario {
	
	private Long id;
	private String descricao;
	
}
