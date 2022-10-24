package com.challenge.challengeJavaEj2.service;

import java.math.BigDecimal;

public interface TarjetaCreditoService {
    float getTasa(String marca, BigDecimal monto);
}
