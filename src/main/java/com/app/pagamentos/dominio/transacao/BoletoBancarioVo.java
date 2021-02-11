package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.IObjetoDeValor;

import java.math.BigDecimal;
import java.util.Date;

public class BoletoBancarioVo implements FormaPagamento, IObjetoDeValor {

    private String codigoBanco;
    private String codigoDeBarras;
    private BigDecimal valorTotal;
    private Date dataVencimento;
    private Date dataEmissao;


}
