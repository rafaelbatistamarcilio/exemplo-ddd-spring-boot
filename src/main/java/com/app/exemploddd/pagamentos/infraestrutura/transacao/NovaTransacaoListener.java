package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.pagamentos.dominio.pedido.PedidoCriadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NovaTransacaoListener {

    @Async
    @EventListener(value = PedidoCriadoEvent.class)
    public void onApplicationEvent(PedidoCriadoEvent eventoPedidoCriado) {
        System.out.println("Evento Recebido: " + eventoPedidoCriado.getTipo());
        try {
            System.out.println("Criando nova transacao... ");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Nova transação criada.");
    }
}
