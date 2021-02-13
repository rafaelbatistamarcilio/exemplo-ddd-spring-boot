package com.app.pagamentos.dominio.transacao;

public class StatusTransacaoVo {

    private Long id;
    private String descricao;
    private String motivo;

    public StatusTransacaoVo(Long id, String descricao, String motivo) {
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
