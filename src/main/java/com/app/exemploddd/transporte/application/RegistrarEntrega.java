package com.app.exemploddd.transporte.application;

import com.app.exemploddd.transporte.domain.ports.IAlocacaoPublisher;
import com.app.exemploddd.transporte.domain.ports.IAlocacaoRepository;

public class RegistrarEntrega {
    
    private IAlocacaoPublisher alocacaoPublisher;
    private IAlocacaoRepository alocacaoRepository;

    public RegistrarEntrega(
        final IAlocacaoPublisher alocacaoPublisher,
        final IAlocacaoRepository alocacaoRepository
    ){
        this.alocacaoPublisher = alocacaoPublisher;
        this.alocacaoRepository = alocacaoRepository;
    }

    public void execute(Long codigoAlocacao) {
        // validar

        this.alocacaoRepository.registrarEntrega(codigoAlocacao);

        var alocacao = this.alocacaoRepository.obterPorId(codigoAlocacao);
        
        this.alocacaoPublisher.notificarPedidoEntregue(alocacao);
    }
}
