package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.Agregado;

import java.math.BigDecimal;

public class Transacao implements Agregado {

    private Long id;
    private BigDecimal valorCobranca;
    private FormaPagamento formaPagamento;
    private StatusTransacao status;
    private boolean ativo;


}
