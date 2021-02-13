package com.app.pagamentos.dominio.pedido;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PedidoAggregate {

    private Long numeroPedido;
    private List<ItemPedidoEntity> itens;
    private BigDecimal valorTotal;
    private BigDecimal frete;
    private StatusPedidoVo status;
    private Date dataRealizacao;
    private ClienteEntity cliente;

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


    public void atualizarStatus(StatusPedidoVo novoStatus) {
        status = novoStatus;
        //TODO: lancar evento caso o pagamento seja aprovado
    }

}
