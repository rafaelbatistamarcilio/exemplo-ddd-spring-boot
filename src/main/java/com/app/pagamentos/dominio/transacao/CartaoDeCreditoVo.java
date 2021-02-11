package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.EnderecoVo;
import com.app.compartilhado.dominio.interfaces.IObjetoDeValor;

import java.util.Date;

public class CartaoDeCreditoVo implements FormaPagamento, IObjetoDeValor {

    private Long numeroCartao;
    private Date dataExpiracao;
    private String nomePortador;
    private Long codigoSeguranca;
    private String bandeira;
    private EnderecoVo enderecoCobranca;

}
