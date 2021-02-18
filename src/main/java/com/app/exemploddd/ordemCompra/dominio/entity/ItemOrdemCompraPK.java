package com.app.exemploddd.ordemCompra.dominio.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemOrdemCompraPK implements Serializable{
	private static final long serialVersionUID = 1L;

	private OrdemCompra ordemCompra;
	private Produto produto;

}
