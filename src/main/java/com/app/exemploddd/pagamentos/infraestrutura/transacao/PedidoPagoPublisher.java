package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.pagamentos.dominio.pedido.PedidoPagoEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PedidoPagoPublisher {

    private final ApplicationEventPublisher publisher;

    public PedidoPagoPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void notificaEventoPedidoPago(Transacao transacao) {
        publisher.publishEvent(new PedidoPagoEvent(transacao));
    }
}
