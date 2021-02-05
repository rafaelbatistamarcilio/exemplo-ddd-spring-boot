package com.app.exemploddd.transporte.infrastructure.adapters.db.projections;

// anotar com @ENtity
public class Pedido {
    
    private Long id;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
