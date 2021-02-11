package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.ObjetoDeValor;

public class StatusPedido implements ObjetoDeValor {

    private Long id;
    private String descricao;

    public StatusPedido(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
