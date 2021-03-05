package com.app.exemploddd.pagamentos.dominio.pedido;

import com.app.exemploddd.pagamentos.infraestrutura.transacao.Transacao;
import com.app.exemploddd.shared.domain.DomainEvent;
import com.fasterxml.jackson.core.JsonProcessingException;

public class PedidoPagoEvent extends DomainEvent {

    private static String tipo = "PEDIDO_PAGO";

    public PedidoPagoEvent(Transacao transacao) throws JsonProcessingException {
        super(transacao, tipo);
    }

}
