package com.app.compartilhado.dominio.eventos;

public class DomainEvent {

    private Object source;
    private String tipo;

    public DomainEvent(Object source, String tipo) {
        this.source = source;
        this.tipo = tipo;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
