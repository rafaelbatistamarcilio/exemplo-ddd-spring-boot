package com.app.pagamentos.infraestrutura.transacao;

import com.app.compartilhado.dominio.eventos.DomainEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NovaTransacaoListener {

    @Async
    @EventListener(condition = "#event.tipo eq 'PEDIDO_PAGO")
    public void onApplicationEvent(DomainEvent domainEvent) {
        System.out.println(domainEvent.getMensagem());
        //se um evento de pedido criado chegou, cria uma nova transacao
    }
}
