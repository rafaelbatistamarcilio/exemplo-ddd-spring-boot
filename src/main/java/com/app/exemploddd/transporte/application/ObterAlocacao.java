package com.app.exemploddd.transporte.application;

import com.app.exemploddd.transporte.domain.entidades.Alocacao;
import com.app.exemploddd.transporte.domain.ports.output.IAlocacaoRepository;

public class ObterAlocacao {
    
    private IAlocacaoRepository repository;

    public ObterAlocacao(final IAlocacaoRepository repository) {
        this.repository = repository;
    }    

    public Alocacao execute(final Long id) {
        return this.repository.obterPorId(id);
    }
}
