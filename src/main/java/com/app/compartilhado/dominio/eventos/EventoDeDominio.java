package com.app.compartilhado.dominio.eventos;

public class EventoDeDominio {

    private String mensagem;
    private String tipo;

    public EventoDeDominio(String mensagem, String tipo) {
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
