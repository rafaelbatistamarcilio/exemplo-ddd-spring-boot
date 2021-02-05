package com.app.exemploddd.transporte.infrastructure.adapters.web.model;

public class ObterAlocacaoResponse {
    public Long id;
    public Long pedido;

    public ObterAlocacaoResponse(Long id, Long pedido) {
        this.id = id;
        this.pedido = pedido;
    }
}
