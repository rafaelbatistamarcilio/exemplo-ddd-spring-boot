package com.app.exemploddd.ordemCompra.dominio.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
public class ItemOrdemCompraVo implements Serializable{
	private static final long serialVersionUID = 1L;

	private ItemOrdemCompraPKVo id =  new ItemOrdemCompraPKVo();
	
	private Double desconto;
	private Integer quantidade;
	private Double preco;
}
