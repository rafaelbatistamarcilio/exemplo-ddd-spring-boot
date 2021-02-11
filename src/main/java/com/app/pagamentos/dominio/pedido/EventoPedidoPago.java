package com.app.compartilhado.dominio;

public class EventoPedidoPago extends EventoDeDominio {

    private String tipo = "PEDIDO_PAGO";

    public EventoPedidoPago(String mensagem, String tipo) {
        super(mensagem, tipo);
    }
}
