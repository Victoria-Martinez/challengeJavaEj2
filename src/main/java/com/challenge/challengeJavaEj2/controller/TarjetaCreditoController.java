package com.challenge.challengeJavaEj2.controller;

import com.challenge.challengeJavaEj2.service.TarjetaCreditoService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
@RequestMapping(path = "/api/tarjetacredito/", produces = "application/JSON", consumes = "application/JSON")
@RestController
public class TarjetaCreditoController {
    @Autowired
    TarjetaCreditoService tarjetaCreditoService;

    @GetMapping(value = "/tasa")
    public ResponseEntity getTasa(@RequestBody @NotNull TasaRequest request) {

        String marca = request.getMarca();
        BigDecimal monto = request.getImporte();
        float tasa = tarjetaCreditoService.getTasa(marca, monto);
        TasaResponse tasaResponse = new TasaResponse(marca,monto,tasa);
        return ResponseEntity.ok(tasaResponse);
    }
}
