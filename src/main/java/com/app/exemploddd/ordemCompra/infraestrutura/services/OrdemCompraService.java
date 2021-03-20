package com.app.exemploddd.ordemCompra.infraestrutura.services;

import com.app.exemploddd.ordemCompra.dominio.modelo.Entrega;
import com.app.exemploddd.ordemCompra.dominio.modelo.Pagamento;
import com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade.OrdemCompra;

public interface OrdemCompraService {
    void enviaAoFinanceiro(OrdemCompra ordemCompra);

    void recebeConfirmacaoDeEntrega(Entrega untrega);

    void recebeConfirmacaoDePagamento(Pagamento pagamento);
}
