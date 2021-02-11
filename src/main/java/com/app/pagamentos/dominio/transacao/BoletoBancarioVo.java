package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.ObjetoDeValor;

import java.math.BigDecimal;
import java.util.Date;

public class BoletoBancario implements FormaPagamento, ObjetoDeValor {

    private String codigoBanco;
    private String codigoDeBarras;
    private BigDecimal valorTotal;
    private Date dataVencimento;
    private Date dataEmissao;


}
