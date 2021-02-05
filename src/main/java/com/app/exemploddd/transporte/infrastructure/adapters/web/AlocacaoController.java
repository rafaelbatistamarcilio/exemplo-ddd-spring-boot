package com.app.exemploddd.transporte.infrastructure.adapters.web;

import com.app.exemploddd.shared.domain.DomainEvent;
import com.app.exemploddd.transporte.application.ObterAlocacao;
import com.app.exemploddd.transporte.domain.entidades.Alocacao;
import com.app.exemploddd.transporte.infrastructure.adapters.web.model.ObterAlocacaoResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alocacao")
public class AlocacaoController {

    @Autowired
    private ObterAlocacao obterAlocacao;

    @Autowired
    private ApplicationEventPublisher publisher;
    

    @GetMapping("publicar")
    public void publicar() throws JsonProcessingException {
        var event = new DomainEvent(new Alocacao(1L, 10L), "PEDIDO_ENTREGUE");
        publisher.publishEvent(event);
    }

    @GetMapping("publicar-errado")
    public void publicarErrado() throws JsonProcessingException {
        var event = new DomainEvent(new Alocacao(1L, 10L), "PEDIDO_ERRADO");
        publisher.publishEvent(event);
    }

    @GetMapping
    public ResponseEntity<ObterAlocacaoResponse> obterAlocacao(Long id) {
        var alocacao = obterAlocacao.execute(id);
        var response = new ObterAlocacaoResponse(alocacao.getId(), alocacao.getIdPedido());
        return ResponseEntity.ok(response);
    }
}
