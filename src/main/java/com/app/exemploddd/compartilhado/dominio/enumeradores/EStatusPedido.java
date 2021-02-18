package com.app.exemploddd.compartilhado.dominio.enumeradores;

public enum EStatusPedido {

    EM_ANALISE(1L),
    AGUARDANDO_PAGAMENTO(2L),
    PAGAMENTO_APROVADO(3L),
    PREPARANDO_ENTREGA(4L),
    ENVIADO_TRANSPORTADORA(5L),
    EM_TRANSITO(6L),
    ENTREGUE(7L);

    private Long codigo;

    EStatusPedido(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }
}
