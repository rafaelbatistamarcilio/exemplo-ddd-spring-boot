package com.app.exemploddd.ordemCompra.dominio.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ItemOrdemCompraPKVo implements Serializable{
	private static final long serialVersionUID = 1L;

	private OrdemCompraVo ordemCompraVo;
	private ProdutoVo produtoVo;

}
