package com.app.exemploddd.ordemCompra.dominio.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class DeliveryConfirmationEvent extends ApplicationEvent {

    private String message;

    public DeliveryConfirmationEvent(final Object source, final String message) {
        super(source);
        this.message = message;
    }
}
