package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.eventos.EventoDeDominio;

public class EventoPedidoPago extends EventoDeDominio {

    private String tipo;

    public EventoPedidoPago(String mensagem, String tipo) {
        super(mensagem, tipo);
    }

}
