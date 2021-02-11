package com.app.pagamentos.infraestrutura.transacao;

import com.app.compartilhado.dominio.eventos.EventoDeDominio;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NovaTransacaoListener {

    @Async
    @EventListener(condition = "#event.tipo eq 'PEDIDO_PAGO")
    public void onApplicationEvent(EventoDeDominio eventoDeDominio) {
        System.out.println(eventoDeDominio.getMensagem());
        //se um evento de pedido criado chegou, cria uma nova transacao
    }
}
