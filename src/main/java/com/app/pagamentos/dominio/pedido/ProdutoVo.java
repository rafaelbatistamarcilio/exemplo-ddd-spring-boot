package com.app.pagamentos.dominio.pedido;

import java.math.BigDecimal;

public class ProdutoVo {

    private Long codigo;
    private String descricao;
    private BigDecimal valorUnitario;

    public ProdutoVo(Long codigo, String descricao, BigDecimal valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

}
