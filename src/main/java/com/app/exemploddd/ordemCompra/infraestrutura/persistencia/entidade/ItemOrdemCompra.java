package com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ItemOrdemCompra implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @EmbeddedId
    private ItemOrdemCompraPK id = new ItemOrdemCompraPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    @JsonIgnore
    public OrdemCompra getOrdemCompra() {
        return id.getOrdemCompra();
    }
}
