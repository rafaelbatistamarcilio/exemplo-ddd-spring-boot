package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.ObjetoDeValor;

public class StatusTransacao implements ObjetoDeValor {

    private Long id;
    private String descricao;
    private String motivo;

    public StatusTransacao(Long id, String descricao, String motivo) {
        this.id = id;
        this.descricao = descricao;
        this.motivo = motivo;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMotivo() {
        return motivo;
    }
}
