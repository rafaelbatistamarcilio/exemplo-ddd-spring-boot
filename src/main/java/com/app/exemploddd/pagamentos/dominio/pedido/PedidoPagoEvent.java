package com.app.exemploddd.pagamentos.dominio.pedido;

import com.app.exemploddd.compartilhado.dominio.eventos.DomainEvent;
import com.app.exemploddd.pagamentos.infraestrutura.transacao.Transacao;

public class PedidoPagoEvent extends DomainEvent {

    private static String tipo = "PEDIDO_PAGO";

    public PedidoPagoEvent(Transacao transacao) {
        super(transacao, tipo);
    }

}
