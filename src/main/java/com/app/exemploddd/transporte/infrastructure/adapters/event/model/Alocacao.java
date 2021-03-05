package com.app.exemploddd.transporte.infrastructure.adapters.event.model;
public class Alocacao {
    
    public Long id;
    public Long idPedido;

    public Alocacao() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "Alocacao [id=" + id + ", idPedido=" + idPedido + "]";
    }
    
}

