package com.app.exemploddd.ordemCompra.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemOrdemCompra implements Serializable{
	private static final long serialVersionUID = 1L;

	private ItemOrdemCompraPK id =  new ItemOrdemCompraPK();
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;

	public double getSubTotal() {
		return (preco - desconto) * quantidade;
	}

	public OrdemCompra getOrdemCompra() {
		return id.getOrdemCompra();
	}
}
