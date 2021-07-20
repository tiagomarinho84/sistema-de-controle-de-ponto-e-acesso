package com.dio.controle.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Calendario {

	private Long id;
	private TipoData tipoData;
	private String descricao;
	private LocalDateTime dataEspecial;
}
