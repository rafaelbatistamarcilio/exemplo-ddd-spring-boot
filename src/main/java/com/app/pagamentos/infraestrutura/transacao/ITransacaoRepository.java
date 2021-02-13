package com.app.pagamentos.infraestrutura.transacao;

import com.app.pagamentos.dominio.transacao.TransacaoAggregate;

public interface ITransacaoRepository {

    TransacaoAggregate obterPorId(Long id);

    TransacaoAggregate obterPorCodigoPedido(String codigoPedido);


}
