package com.app.compartilhado.dominio;

import com.app.compartilhado.dominio.interfaces.ObjetoDeValor;

public class Endereco implements ObjetoDeValor {

    private String rua;
    private Long numero;
    private Long cep;
    private String bairro;
    private String cidade;
    private String complemento;

    public Endereco(String rua, Long numero, Long cep, String bairro, String cidade, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public Long getNumero() {
        return numero;
    }

    public Long getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }
}
