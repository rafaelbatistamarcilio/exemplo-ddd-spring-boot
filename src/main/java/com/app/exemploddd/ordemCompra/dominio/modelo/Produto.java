package com.app.exemploddd.ordemCompra.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private Double preco;
    private Set<ItemOrdemCompra> itens = new HashSet<>();

    public List<OrdemCompra> getOrdemCompra() {
        List<OrdemCompra> list = new ArrayList<>();

        itens
				.stream()
				.forEach(item -> list.add(item.getOrdemCompra()));

        return list;
    }
}
