package com.app.exemploddd.transporte.application;

import com.app.exemploddd.transporte.domain.entidades.Alocacao;
import com.app.exemploddd.transporte.domain.ports.output.IAlocacaoRepository;

public class AlocarPedido {

    private IAlocacaoRepository alocacaoRepository;

    public AlocarPedido(IAlocacaoRepository alocacaoRepository) {
        this.alocacaoRepository = alocacaoRepository;
    }

    public void execute(final Long idPedido) {
        var statusPedido = this.alocacaoRepository.obterStatusPedido(idPedido);
        
        var alocacao = new Alocacao(null, idPedido);
        alocacao.validar(statusPedido);
        this.alocacaoRepository.incluirAlocacao(alocacao);
    }
}
