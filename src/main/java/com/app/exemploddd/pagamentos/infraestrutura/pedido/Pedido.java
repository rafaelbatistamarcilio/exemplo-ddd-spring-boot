package com.app.exemploddd.pagamentos.infraestrutura.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido", schema = "exemplo_ddd")
public class Pedido {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


}
