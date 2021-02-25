package com.app.exemploddd.pagamentos.visao;

import com.app.exemploddd.compartilhado.dominio.enumeradores.EStatusPedido;
import com.app.exemploddd.ordemCompra.dominio.event.OrdemCompraEvent;
import com.app.exemploddd.pagamentos.dominio.pedido.PedidoAggregate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    ApplicationEventPublisher publisher;

    @RequestMapping("/criarPedido")
    public String criarPedido() {
        OrdemCompraEvent ordemCompraEvent = new OrdemCompraEvent(new PedidoAggregate(1L, EStatusPedido.AGUARDANDO_PAGAMENTO), "PEDIDO_CRIADO");
        publisher.publishEvent(ordemCompraEvent);
        return "Criando pedido...";

    }


}
