package com.app.exemploddd.pagamentos.infraestrutura.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SituacaoPedido {

    @Id
    @GeneratedValue
    private Long id;
}
