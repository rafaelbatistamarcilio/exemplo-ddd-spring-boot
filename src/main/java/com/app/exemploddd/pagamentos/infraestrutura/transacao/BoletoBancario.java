package com.app.exemploddd.pagamentos.infraestrutura.transacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BoletoBancario {

    @Id
    @GeneratedValue
    private Long id;
}
