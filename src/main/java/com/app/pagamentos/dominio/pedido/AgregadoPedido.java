package com.app.pagamentos.dominio.pedido;

import com.app.compartilhado.dominio.interfaces.IAgregado;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AgregadoPedido implements IAgregado {

    private Long numeroPedido;
    private List<EntidadeItemPedido> itens;
    private BigDecimal valorTotal;
    private BigDecimal frete;
    private StatusPedidoVo status;
    private Date dataRealizacao;
    private EntidadeCliente cliente;

    public AgregadoPedido(Long numeroPedido, List<EntidadeItemPedido> itens, BigDecimal valorTotal, BigDecimal frete, StatusPedidoVo status, Date dataRealizacao) {
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.frete = frete;
        this.status = status;
        this.dataRealizacao = dataRealizacao;
    }

    public void adicionarItem(EntidadeItemPedido item) {
        itens.add(item);
        valorTotal = valorTotal.add(item.getValorTotal());
    }

    public void removerItem(EntidadeItemPedido item) {
        itens.remove(item);
        valorTotal = valorTotal.subtract(item.getValorTotal());
    }

    public void adicionarFrete(BigDecimal valorFrete) {
        frete = valorFrete;
        valorTotal = valorTotal.add(valorFrete);
    }


    public void atualizarStatus(StatusPedidoVo novoStatus) {
        status = novoStatus;
        //TODO: lancar evento caso o pagamento seja aprovado
    }

    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<EntidadeItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<EntidadeItemPedido> itens) {
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

    public StatusPedidoVo getStatus() {
        return status;
    }

    public void setStatus(StatusPedidoVo status) {
        this.status = status;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
}
