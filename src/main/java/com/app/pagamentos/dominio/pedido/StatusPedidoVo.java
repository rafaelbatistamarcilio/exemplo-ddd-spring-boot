package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.IObjetoDeValor;

public class StatusPedidoVo implements IObjetoDeValor {

    private Long id;
    private String descricao;

    public StatusPedidoVo(Long id, String descricao) {
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
