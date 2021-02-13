package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.EnderecoVo;

import java.util.Date;

public class CartaoDeCreditoVo extends FormaPagamentoVo {

    private Long numeroCartao;
    private Date dataExpiracao;
    private String nomePortador;
    private Long codigoSeguranca;
    private String bandeira;
    private EnderecoVo enderecoCobranca;

}
