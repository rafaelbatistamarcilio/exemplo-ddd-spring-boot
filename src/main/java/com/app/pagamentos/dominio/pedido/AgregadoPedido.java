package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.Agregado;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Pedido implements Agregado {

    private Long numeroPedido;
    private List<ItemPedido> itens;
    private BigDecimal valorTotal;
    private BigDecimal frete;
    private StatusPedido status;
    private Date dataRealizacao;

    public Pedido(Long numeroPedido, List<ItemPedido> itens, BigDecimal valorTotal, BigDecimal frete, StatusPedido status, Date dataRealizacao) {
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.frete = frete;
        this.status = status;
        this.dataRealizacao = dataRealizacao;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        valorTotal = valorTotal.add(item.getValorTotal());
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
        valorTotal = valorTotal.subtract(item.getValorTotal());
    }

    public void adicionarFrete(BigDecimal valorFrete) {
        frete = valorFrete;
        valorTotal = valorTotal.add(valorFrete);
    }


    public void atualizarStatus(StatusPedido novoStatus) {
        status = novoStatus;
        //TODO: lancar evento caso o pagamento seja aprovado
    }

    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
}
