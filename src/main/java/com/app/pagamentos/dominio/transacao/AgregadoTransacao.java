package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.IAgregado;

import java.math.BigDecimal;
import java.util.List;

public class AgregadoTransacao implements IAgregado {

    private Long id;
    private BigDecimal valorCobranca;
    private FormaPagamento formaPagamento;
    private StatusTransacaoVo status;
    private List<LogTransacaoVo> log;
    private boolean ativo;


}
