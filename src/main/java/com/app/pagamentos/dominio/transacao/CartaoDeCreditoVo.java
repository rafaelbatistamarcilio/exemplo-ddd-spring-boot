package com.app.pagamentos.dominio.transacao;

import com.app.compartilhado.dominio.interfaces.ObjetoDeValor;
import com.app.pagamentos.dominio.cliente.Cliente;

import java.util.Date;

public class CartaoDeCredito implements FormaPagamento, ObjetoDeValor {

    private Long numeroCartao;
    private Date dataExpiracao;
    private String nomePortador;
    private Long codigoSeguranca;
    private Cliente cliente;
    private String bandeira;

}
