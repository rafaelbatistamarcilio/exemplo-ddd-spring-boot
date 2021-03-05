package com.app.exemploddd.transporte.domain.entidades;

public class Alocacao {
    
    private Long id;
    private Long idPedido;

    public Alocacao(Long id, Long idPedido) {
        this.id = id;
        this.idPedido = idPedido;
    }

    public Long getId() {
        return id;
    }

    public Long getIdPedido() {
        return idPedido;
    }

	public void validar(String statusPedido) {
        if(!"PAGO".equals(statusPedido)) {
            throw new RuntimeException("Pedido não pode ser alocado se não estiver pago");
        }
	}
}
