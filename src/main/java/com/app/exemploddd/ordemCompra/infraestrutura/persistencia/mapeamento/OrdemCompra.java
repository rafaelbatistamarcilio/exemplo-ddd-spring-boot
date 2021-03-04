package com.app.exemploddd.ordemCompra.infraestrutura.persistencia.mapeamento;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OrdemCompra implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPedido")
    @SequenceGenerator(name = "seqPedido", sequenceName = "seq_id_pedido")
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm")
    private Date data;

    // @OneToMany(mappedBy = "pedido")
    @Transient
    private Set<ItemOrdemCompra> itens = new HashSet<>();

}
