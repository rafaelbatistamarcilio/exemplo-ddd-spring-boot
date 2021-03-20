package com.app.exemploddd.shared.entities;

import com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade.ItemOrdemCompra;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProduto")
    @SequenceGenerator(name = "seqProduto", sequenceName = "seq_id_produto")
    private Integer id;
    private String nome;
    private Double preco;

    @JsonIgnore
    @OneToMany(mappedBy = "id.produto")
    private Set<ItemOrdemCompra> itens = new HashSet<>();

}

