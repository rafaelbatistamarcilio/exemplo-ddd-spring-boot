package com.app.exemploddd.pagamentos.dominio.transacao;

import java.math.BigDecimal;
import java.util.Date;

public class BoletoBancarioVo extends FormaPagamentoVo {

    private String codigoBanco;
    private String codigoDeBarras;
    private BigDecimal valorTotal;
    private Date dataVencimento;
    private Date dataEmissao;


}
