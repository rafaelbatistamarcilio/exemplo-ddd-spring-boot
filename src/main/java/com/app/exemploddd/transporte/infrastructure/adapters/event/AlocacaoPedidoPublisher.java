package com.app.exemploddd.transporte.infrastructure.adapters.event;

import com.app.exemploddd.shared.domain.DomainEvent;
import com.app.exemploddd.transporte.domain.entidades.Alocacao;
import com.app.exemploddd.transporte.domain.ports.IAlocacaoPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AlocacaoPedidoPublisher implements IAlocacaoPublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Override
    public void notificarPedidoEntregue(Alocacao alocacao) {
        try {
            var event = new DomainEvent(alocacao, "PEDIDO_ENTREGUE");
            publisher.publishEvent(event);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
