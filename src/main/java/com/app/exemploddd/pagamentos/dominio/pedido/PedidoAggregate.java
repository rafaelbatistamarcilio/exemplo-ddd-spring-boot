package com.app.exemploddd.pagamentos.dominio.pedido;

import com.app.exemploddd.compartilhado.dominio.enumeradores.EStatusPedido;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PedidoAggregate {

    private Long numeroPedido;
    private Long idTransacao;
    private List<ItemPedidoEntity> itens;
    private BigDecimal valorTotal;
    private BigDecimal frete;
    private EStatusPedido status;
    private Date dataRealizacao;
    private ClienteEntity cliente;

    public PedidoAggregate(Long numeroPedido, EStatusPedido status) {
        this.numeroPedido = numeroPedido;
        this.status = status;
    }

    public void adicionarItem(ItemPedidoEntity item) {
        itens.add(item);
        valorTotal = valorTotal.add(item.getValorTotal());
    }

    public void removerItem(ItemPedidoEntity item) {
        itens.remove(item);
        valorTotal = valorTotal.subtract(item.getValorTotal());
    }

    public void adicionarFrete(BigDecimal valorFrete) {
        frete = valorFrete;
        valorTotal = valorTotal.add(valorFrete);
    }


    public void atualizarStatus(EStatusPedido novoStatus) {
        status = novoStatus;
        //TODO: lancar evento caso o pagamento seja aprovado
    }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {
        this.idTransacao = idTransacao;
    }

}
