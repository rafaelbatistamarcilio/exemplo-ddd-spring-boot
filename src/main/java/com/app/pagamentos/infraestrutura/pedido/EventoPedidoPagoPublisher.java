package com.app.pagamentos.infraestrutura.pedido;

import com.app.pagamentos.dominio.pedido.EventoPedidoPago;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventoPedidoPagoPublisher {

    private final ApplicationEventPublisher publisher;

    public EventoPedidoPagoPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    void publishEvent(final String tipo) {
        publisher.publishEvent(new EventoPedidoPago("", "PEDIDO_PAGO"));
    }
}
