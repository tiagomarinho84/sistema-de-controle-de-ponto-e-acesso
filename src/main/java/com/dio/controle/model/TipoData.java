package com.dio.controle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoData {
	
	private Long id;
	private String descricao;
}
