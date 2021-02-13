package com.app.pagamentos.dominio.pedido;

import java.math.BigDecimal;

public class ItemPedidoEntity {

    private Long identificador;
    private ProdutoVo produto;
    private Long quantidade;
    private BigDecimal valorTotal;

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
