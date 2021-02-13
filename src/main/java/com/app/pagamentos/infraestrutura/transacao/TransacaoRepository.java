package com.app.pagamentos.infraestrutura.transacao;

import com.app.pagamentos.dominio.transacao.TransacaoAggregate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class TransacaoRepository implements ITransacaoRepository {

    private EntityManager entityManager;

    public TransacaoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public TransacaoAggregate obterPorId(Long id) {
        return null;
    }

    @Override
    public TransacaoAggregate obterPorCodigoPedido(String codigoPedido) {
        return null;
    }
}
