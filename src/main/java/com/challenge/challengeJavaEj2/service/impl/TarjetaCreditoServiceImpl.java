package com.challenge.challengeJavaEj2.service.impl;

import com.challenge.challengeJavaEj2.exception.MarcaNoEncontradaException;
import com.challenge.challengeJavaEj2.service.TarjetaCreditoService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {
    public float getTasa(String marca, BigDecimal monto) {
        float tasa;

        switch (marca.toUpperCase()){
            case "AMEX": tasa = (float) (LocalDate.now().getMonthValue() * 0.1); break;
            case "NARA": tasa = (float) (LocalDate.now().getDayOfMonth() * 0.5); break;
            case "VISA": tasa = LocalDate.now().getYear()%100 / LocalDate.now().getMonthValue(); break;
            default: throw new MarcaNoEncontradaException(marca);
        }
        if (tasa < 0.3){
            tasa = 0.3f;
        }else if (tasa > 5){
            tasa = 5;
        }
        return tasa;
    }
}
