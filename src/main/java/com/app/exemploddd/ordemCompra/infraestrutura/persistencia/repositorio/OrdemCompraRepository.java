package com.app.exemploddd.ordemCompra.infraestrutura.persistencia.repositorio;

import com.app.exemploddd.ordemCompra.dominio.entity.OrdemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemCompraRepository extends JpaRepository<OrdemCompra, Long> {
}
