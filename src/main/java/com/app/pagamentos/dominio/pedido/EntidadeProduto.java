package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.Entidade;

import java.math.BigDecimal;

public class Produto implements Entidade {

    private Long identificador;
    private String descricao;
    private BigDecimal valorUnitario;
    private Long peso;

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }
}
