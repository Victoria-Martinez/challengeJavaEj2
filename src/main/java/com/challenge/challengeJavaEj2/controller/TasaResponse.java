package com.challenge.challengeJavaEj2.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
public class TasaResponse {
    private String marca;
    private BigDecimal importe;
    private float tasa;
}
