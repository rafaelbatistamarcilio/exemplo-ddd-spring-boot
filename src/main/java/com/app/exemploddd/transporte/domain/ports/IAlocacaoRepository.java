package com.app.exemploddd.transporte.domain.ports;

import com.app.exemploddd.transporte.domain.entidades.Alocacao;

public interface IAlocacaoRepository {
    
    public String obterStatusPedido(final Long id);

	public Long incluirAlocacao(final Alocacao alocacao);

	public Alocacao obterPorId(Long id);

	public void registrarEntrega(Long alocacao);
}
