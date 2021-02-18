package com.app.exemploddd.transporte.infrastructure.adapters.db.projections;

// @Entity
public class Alocacao {
    private Long id;
    private Long idPedido;

    public Alocacao(Long id, Long idPedido) {
        this.id = id;
        this.idPedido = idPedido;
    }

    public Long getId() {
        return id;
    }

    public Long getIdPedido() {
        return idPedido;
    }
}
