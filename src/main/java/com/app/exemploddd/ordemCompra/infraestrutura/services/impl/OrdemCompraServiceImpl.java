package com.app.exemploddd.ordemCompra.infraestrutura.services.impl;

import com.app.exemploddd.ordemCompra.dominio.entity.Entrega;
import com.app.exemploddd.ordemCompra.dominio.entity.OrdemCompra;
import com.app.exemploddd.ordemCompra.dominio.entity.Pagamento;
import com.app.exemploddd.ordemCompra.dominio.event.OrdemCompraEventPublisher;
// import com.app.exemploddd.ordemCompra.infraestrutura.persistencia.repositorio.OrdemCompraRepository;
import com.app.exemploddd.ordemCompra.infraestrutura.services.OrdemCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemCompraServiceImpl implements OrdemCompraService {

    @Autowired
    private OrdemCompraEventPublisher ordemCompraEventPublisher;

    // @Autowired
    // private OrdemCompraRepository ordemCompraRepository;

    @Override
    public void enviaAoFinanceiro(final OrdemCompra ordemCompra) {
        // ordemCompraRepository.save(ordemCompra);
        ordemCompraEventPublisher.publishOrdemCompraEvent(ordemCompra);
    }

    @Override
    public void recebeConfirmacaoDeEntrega(final Entrega entrega) {
        System.out.println("Escuta confirmacao da entrega");
    }

    @Override
    public void recebeConfirmacaoDePagamento(final Pagamento pagamento) {
        System.out.println("Escuta confirmacao de pagamento");
    }
}
