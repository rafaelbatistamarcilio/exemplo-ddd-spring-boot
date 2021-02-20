package com.app.exemploddd.ordemCompra.dominio.event;

import com.app.exemploddd.ordemCompra.dominio.entity.OrdemCompra;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OrdemCompraEvent extends ApplicationEvent {

    private OrdemCompra ordemCompra;
    private String message;

    public OrdemCompraEvent(final Object source, final OrdemCompra ordemCompra) {
        super(source);
        this.ordemCompra = ordemCompra;
    }
}
