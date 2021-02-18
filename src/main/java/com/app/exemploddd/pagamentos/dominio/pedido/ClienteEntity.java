package com.app.exemploddd.pagamentos.dominio.pedido;

import com.app.exemploddd.compartilhado.dominio.EnderecoVo;
import com.app.exemploddd.pagamentos.dominio.transacao.CartaoDeCreditoVo;

import java.util.Date;
import java.util.List;

public class ClienteEntity {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private EnderecoVo enderecoVoEnvio;
    private List<CartaoDeCreditoVo> cartoes;

}
