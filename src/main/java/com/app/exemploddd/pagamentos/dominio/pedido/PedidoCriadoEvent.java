package com.app.exemploddd.pagamentos.dominio.pedido;

import com.app.exemploddd.compartilhado.dominio.eventos.DomainEvent;

public class PedidoCriadoEvent extends DomainEvent {

    public PedidoCriadoEvent(PedidoAggregate source) {
        super(source, "PEDIDO_CRIADO");
    }
}
