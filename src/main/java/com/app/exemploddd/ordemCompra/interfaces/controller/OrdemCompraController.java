package com.app.exemploddd.ordemCompra.interfaces.controller;

import com.app.exemploddd.ordemCompra.dominio.dto.ConfirmacaoDeEntregaDto;
import com.app.exemploddd.ordemCompra.dominio.dto.ConfirmacaoDePagamentoDto;
import com.app.exemploddd.ordemCompra.dominio.dto.OrdemCompraDto;
import com.app.exemploddd.ordemCompra.dominio.modelo.Entrega;
import com.app.exemploddd.ordemCompra.dominio.modelo.Pagamento;
import com.app.exemploddd.ordemCompra.infraestrutura.persistencia.entidade.OrdemCompra;
import com.app.exemploddd.ordemCompra.infraestrutura.services.OrdemCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/ordemCompra")
public class OrdemCompraController {

    @Autowired
    private OrdemCompraService ordemCompraService;

    @PostMapping("/enviaAoFinanceiro")
    public ResponseEntity<?> enviaAoFinanceiro(@Valid @RequestBody final OrdemCompraDto dto) {
        ordemCompraService.enviaAoFinanceiro(new OrdemCompra());
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/recebeConfirmacaoDeEntrega")
    public ResponseEntity<?> recebeConfirmacaoDeEntrega(@Valid @RequestBody final ConfirmacaoDeEntregaDto dto) {
        ordemCompraService.recebeConfirmacaoDeEntrega(new Entrega());
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/recebeConfirmacaoDePagamento")
    public ResponseEntity<?> recebeConfirmacaoDePagamento(@Valid @RequestBody final ConfirmacaoDePagamentoDto dto) {
        ordemCompraService.recebeConfirmacaoDePagamento(new Pagamento());
        return ResponseEntity.noContent().build();
    }
}
