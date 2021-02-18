package com.app.exemploddd.pagamentos.visao;

import com.app.exemploddd.pagamentos.dominio.transacao.TransacaoAggregate;
import com.app.exemploddd.pagamentos.infraestrutura.transacao.ITransacaoRepository;
import com.app.exemploddd.pagamentos.infraestrutura.transacao.PedidoPagoPublisher;
import com.app.exemploddd.pagamentos.infraestrutura.transacao.Transacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    @Autowired
    private ITransacaoRepository repositorioTransacao;

    @Autowired
    private PedidoPagoPublisher pedidoPagoPublisher;

    @PostMapping("/realizarPagamento/{pedidoId}")
    public String realizarDadosPagamento(@PathVariable Long pedidoId,
                                       @RequestBody PagamentoDto pagamentoDto) {

        TransacaoAggregate transacaoAggregate = repositorioTransacao.obterPorCodigoPedido(pedidoId);
        // com a fabrica, converte o agregado em uma entidade de Transacao
        Transacao transacao = new Transacao();
        // salva os dados de pagamento na transacao
        // realiza pagamento via API externa
        // se o retorno foi OK, lanca evento de pagamento efeituado
        pedidoPagoPublisher.notificaEventoPedidoPago(transacao);
        return "OK";
    }

}
