package com.dio.controle.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Empresa {

	private Long id;
	private String descricao;
	private String cnpj;
	private String endereco;
	private String bairro;
	private String estado;
	private String telefone;
}
