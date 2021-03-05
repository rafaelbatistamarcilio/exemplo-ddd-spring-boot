package com.app.exemploddd.transporte.infrastructure.adapters.db.repository;

import java.util.ArrayList;

import com.app.exemploddd.transporte.domain.entidades.Alocacao;
import com.app.exemploddd.transporte.domain.ports.IAlocacaoRepository;

import org.springframework.stereotype.Repository;

@Repository
public class AlocacaoRepository implements IAlocacaoRepository {

    // aqui podemos injetar repositórios do spring
    // ou podemos injetar diretamente o entity manager

    private ArrayList<com.app.exemploddd.transporte.infrastructure.adapters.db.projections.Alocacao> alocacoes = new ArrayList<>();
    private ArrayList<com.app.exemploddd.transporte.infrastructure.adapters.db.projections.Pedido> pedidos = new ArrayList<>();

    @Override
    public String obterStatusPedido(Long id) {
        var result = pedidos.stream().filter(item -> item.getId().equals(id)).findFirst();
        return result.get().getStatus();
    }

    @Override
    public Long incluirAlocacao(Alocacao alocacao) {

        Long id = Long.valueOf(alocacoes.size() + 1);
        var projecao = new com.app.exemploddd.transporte.infrastructure.adapters.db.projections.Alocacao(id,
                alocacao.getIdPedido());
                
        alocacoes.add(projecao); // salvar no banco
        return id;
    }

    @Override
    public Alocacao obterPorId(Long id) {
        var result = alocacoes.stream().filter(item -> item.getId().equals(id)).findFirst();

        if(!result.isPresent()) return null; 

        com.app.exemploddd.transporte.infrastructure.adapters.db.projections.Alocacao alocacao = result.get();
        return new Alocacao(alocacao.getId(), alocacao.getIdPedido());
    }

    @Override
    public void registrarEntrega(Long alocacao) {
        // TODO alterar o status da alocação

    }
}
