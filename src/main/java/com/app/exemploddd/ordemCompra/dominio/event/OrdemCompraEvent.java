package com.app.exemploddd.ordemCompra.dominio.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OrdemCompraEvent extends ApplicationEvent {

    private String message;

    public OrdemCompraEvent(final Object source, final String message) {
        super(source);
        this.message = message;
    }
}
