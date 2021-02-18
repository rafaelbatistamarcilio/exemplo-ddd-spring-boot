package com.app.exemploddd.transporte.infrastructure.adapters.event;

import com.app.exemploddd.shared.domain.DomainEvent;
import com.app.exemploddd.transporte.application.AlocarPedido;
import com.app.exemploddd.transporte.infrastructure.adapters.event.model.Alocacao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AlocacaoPedidoListener {

    @Autowired 
    private AlocarPedido alocarPedido;

    @Async
    @EventListener(value = DomainEvent.class, condition = "#event.type=='PEDIDO_ENTREGUE'")
    public void onApplicationEvent(DomainEvent event) throws JsonMappingException, JsonProcessingException {

        var dados = event.jsonTo(Alocacao.class);
        alocarPedido.execute(dados.getIdPedido());
    }
}
