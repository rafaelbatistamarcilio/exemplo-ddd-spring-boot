package com.app.exemploddd.ordemCompra.dominio.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Setter
public class OrdemCompraVo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date data;
	private Set<ItemOrdemCompraVo> itens = new HashSet<>();

}
