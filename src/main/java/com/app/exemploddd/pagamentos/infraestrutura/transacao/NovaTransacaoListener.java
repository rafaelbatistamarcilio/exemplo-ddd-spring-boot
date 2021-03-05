package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.shared.domain.DomainEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NovaTransacaoListener {

    @Async
    @EventListener(value = DomainEvent.class, condition = "#evento.type=='PEDIDO_CRIADO'")
    public void onApplicationEvent(DomainEvent evento) {
        System.out.println("Evento Recebido: " + evento.getType());
        try {
            System.out.println("Criando nova transacao... ");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Nova transação criada.");
    }
}
