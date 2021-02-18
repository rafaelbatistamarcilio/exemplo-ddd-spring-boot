package com.app.exemploddd.transporte.domain.ports;

import com.app.exemploddd.transporte.domain.entidades.Alocacao;

public interface IAlocacaoPublisher {
    
    public void notificarPedidoEntregue(final Alocacao alocacao);
}
