package com.app.exemploddd.ordemCompra.dominio.event;

import org.springframework.context.ApplicationListener;

public class OrdemCompraEventListener implements ApplicationListener<OrdemCompraEvent> {
    @Override
    public void onApplicationEvent(final OrdemCompraEvent ordemCompraEvent) {
        System.out.println("Recebe confirmacao do pagamento" + ordemCompraEvent.getMessage());
    }
}
