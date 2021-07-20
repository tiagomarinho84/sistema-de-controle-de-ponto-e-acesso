package com.dio.controle.model;

import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Localidade {

	private Long id;
	private String descricao;
	@ManyToOne
	private NivelAcesso nivelAcesso;
}
