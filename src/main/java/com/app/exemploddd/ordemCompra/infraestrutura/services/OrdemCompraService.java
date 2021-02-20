package com.app.exemploddd.ordemCompra.infraestrutura.services;

import com.app.exemploddd.ordemCompra.dominio.entity.Entrega;
import com.app.exemploddd.ordemCompra.dominio.entity.OrdemCompra;
import com.app.exemploddd.ordemCompra.dominio.entity.Pagamento;

public interface OrdemCompraService {
    void enviaAoFinanceiro(OrdemCompra ordemCompra);

    void recebeConfirmacaoDeEntrega(Entrega untrega);

    void recebeConfirmacaoDePagamento(Pagamento pagamento);
}
