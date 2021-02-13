package com.app.pagamentos.infraestrutura.transacao;

import com.app.pagamentos.dominio.pedido.PedidoPagoEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PedidoPagoPublisher {

    private final ApplicationEventPublisher publisher;

    public PedidoPagoPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    void notificaEventoPedidoPago() {
        publisher.publishEvent(new PedidoPagoEvent(new Transacao()));
    }
}
