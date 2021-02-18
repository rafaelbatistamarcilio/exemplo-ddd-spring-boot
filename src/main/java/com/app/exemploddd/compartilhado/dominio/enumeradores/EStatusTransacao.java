package com.app.exemploddd.compartilhado.dominio.enumeradores;

public enum EStatusTransacao {

    PROCESSANDO(1L),
    AUTORIZADA(2L),
    PAGA (3L),
    ESTORNADA(4L),
    AGUARDANDO_PAGAMENTO(4L),
    AGAURDANDO_ESTORNO_SOLICITADO(5L),
    RECUSADA(6L);

    private Long codigo;

    EStatusTransacao(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }
}
