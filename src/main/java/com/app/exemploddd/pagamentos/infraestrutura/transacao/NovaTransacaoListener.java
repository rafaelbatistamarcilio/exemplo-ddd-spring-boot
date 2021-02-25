package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.ordemCompra.dominio.event.OrdemCompraEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NovaTransacaoListener {

    @Async
    @EventListener(value = OrdemCompraEvent.class)
    public void onApplicationEvent(OrdemCompraEvent eventoOrdemCompra) {
        System.out.println("Evento Recebido: " + eventoOrdemCompra.getMessage());
        try {
            System.out.println("Criando nova transacao... ");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Nova transação criada.");
    }
}
