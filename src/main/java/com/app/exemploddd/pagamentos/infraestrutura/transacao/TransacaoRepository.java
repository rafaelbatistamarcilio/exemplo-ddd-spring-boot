package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import com.app.exemploddd.pagamentos.dominio.transacao.TransacaoAggregate;
import org.springframework.stereotype.Repository;

@Repository
public class TransacaoRepository implements ITransacaoRepository {

    @Override
    public TransacaoAggregate obterPorId(Long id) {
        return null;
    }

    @Override
    public TransacaoAggregate obterPorCodigoPedido(Long codigoPedido) {
        return null;
    }
}
