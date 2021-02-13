package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.eventos.DomainEvent;
import com.app.pagamentos.infraestrutura.transacao.Transacao;

public class PedidoPagoEvent extends DomainEvent {

    private static String tipo = "PEDIDO_PAGO";

    public PedidoPagoEvent(Transacao transacao) {
        super(transacao, tipo);
    }

}
