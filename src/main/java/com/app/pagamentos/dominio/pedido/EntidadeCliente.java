package com.app.pagamentos.dominio.cliente;

import com.app.compartilhado.dominio.EnderecoVo;
import com.app.compartilhado.dominio.interfaces.IAgregado;

import java.util.Date;

public class EntidadeCliente implements IAgregado {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private EnderecoVo enderecoVoCobranca;
    private EnderecoVo enderecoVoEnvio;

    public EntidadeCliente(String nome, String cpf, Date dataNascimento, String telefone, EnderecoVo enderecoVoCobranca, EnderecoVo enderecoVoEnvio) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.enderecoVoCobranca = enderecoVoCobranca;
        this.enderecoVoEnvio = enderecoVoEnvio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnderecoVo getEnderecoCobranca() {
        return enderecoVoCobranca;
    }

    public void setEnderecoCobranca(EnderecoVo enderecoVoCobranca) {
        this.enderecoVoCobranca = enderecoVoCobranca;
    }

    public EnderecoVo getEnderecoEnvio() {
        return enderecoVoEnvio;
    }

    public void setEnderecoEnvio(EnderecoVo enderecoVoEnvio) {
        this.enderecoVoEnvio = enderecoVoEnvio;
    }
}
