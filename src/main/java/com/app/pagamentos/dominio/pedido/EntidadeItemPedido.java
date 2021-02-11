package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.Entidade;

import java.math.BigDecimal;

public class ItemPedido implements Entidade {

    private Long identificador;
    private Produto produto;
    private Long quantidade;
    private BigDecimal valorTotal;

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
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
