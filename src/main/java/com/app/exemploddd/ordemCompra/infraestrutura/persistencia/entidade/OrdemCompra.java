package com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm")
    private Date data;

    @OneToMany(mappedBy = "id.ordemCompra")
    private Set<ItemOrdemCompra> itens = new HashSet<>();

    public com.app.exemploddd.ordemCompra.dominio.modelo.OrdemCompra fromModel() {
        return new com.app.exemploddd.ordemCompra.dominio.modelo.OrdemCompra();
    }
}
