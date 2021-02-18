package com.app.exemploddd.pagamentos.visao;

import java.util.Date;

public class PagamentoDto {

    private Long numeroCartao;
    private Date dataExpiracao;
    private String nomePortador;
    private Long codigoSeguranca;
    private String bandeira;

    public Long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getNomePortador() {
        return nomePortador;
    }

    public void setNomePortador(String nomePortador) {
        this.nomePortador = nomePortador;
    }

    public Long getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(Long codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
