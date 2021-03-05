package com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade;

import com.app.exemploddd.shared.entities.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class ItemOrdemCompraPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "ordemCompra_id")
    private OrdemCompra ordemCompra;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

}
