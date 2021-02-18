package com.app.exemploddd.pagamentos.infraestrutura.pedido;

import com.app.exemploddd.pagamentos.dominio.pedido.PedidoAggregate;

public interface IPedidoRepository {

    PedidoAggregate obterPorId(Long id);
}
