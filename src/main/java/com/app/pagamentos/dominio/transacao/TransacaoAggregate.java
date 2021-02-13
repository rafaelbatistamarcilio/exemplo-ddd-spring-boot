package com.app.pagamentos.dominio.transacao;

import java.math.BigDecimal;

public class TransacaoAggregate {

    private Long id;
    private BigDecimal valorCobranca;
    private FormaPagamentoVo formaPagamentoVo;
    private StatusTransacaoVo status;
    private boolean ativo;


}
