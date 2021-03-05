package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.pagamentos.dominio.transacao.TransacaoAggregate;

public interface ITransacaoRepository {

    TransacaoAggregate obterPorId(Long id);

    TransacaoAggregate obterPorCodigoPedido(Long codigoPedido);


}
