package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.IEntidade;

import java.math.BigDecimal;

public class EntidadeItemPedido implements IEntidade {

    private Long identificador;
    private EntidadeProduto produto;
    private Long quantidade;
    private BigDecimal valorTotal;

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public EntidadeProduto getProduto() {
        return produto;
    }

    public void setProduto(EntidadeProduto produto) {
        this.produto = produto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
