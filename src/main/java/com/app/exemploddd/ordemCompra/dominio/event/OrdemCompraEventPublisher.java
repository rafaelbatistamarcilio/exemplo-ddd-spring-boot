package com.app.exemploddd.ordemCompra.dominio.event;

import com.app.exemploddd.ordemCompra.dominio.modelo.OrdemCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class OrdemCompraEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishOrdemCompraEvent(final OrdemCompra ordemCompra) {
        System.out.println("Enviando ordem de compra para o financeiro");

        OrdemCompraEvent event = new OrdemCompraEvent(this, ordemCompra);

        applicationEventPublisher.publishEvent(event);
    }
}
