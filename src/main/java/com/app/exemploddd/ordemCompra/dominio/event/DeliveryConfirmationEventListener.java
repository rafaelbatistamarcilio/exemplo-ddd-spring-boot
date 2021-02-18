package com.app.exemploddd.ordemCompra.dominio.event;

import org.springframework.context.ApplicationListener;

public class DeliveryConfirmationEventListener implements ApplicationListener<DeliveryConfirmationEvent> {
    @Override
    public void onApplicationEvent(final DeliveryConfirmationEvent deliveryConfirmationEvent) {
        System.out.println("Recebe confirmacao da entrega" + deliveryConfirmationEvent.getMessage());
    }
}
