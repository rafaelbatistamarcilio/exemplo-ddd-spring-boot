package com.app.exemploddd.pagamentos.dominio.pedido;

public class StatusPedidoVo {

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
