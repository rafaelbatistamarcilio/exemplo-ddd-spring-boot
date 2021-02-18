package com.app.exemploddd.ordemCompra.dominio.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdemCompra implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date data;
	private Set<ItemOrdemCompra> itens = new HashSet<>();

	public double getTotal() {
		double total = itens
				.stream().mapToDouble(ItemOrdemCompra::getSubTotal).sum();

		return total;
	}
}
