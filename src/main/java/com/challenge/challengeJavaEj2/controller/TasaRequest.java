package com.challenge.challengeJavaEj2.controller;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
@Data
public class TasaRequest {
    @NotNull String marca;
    @NotNull BigDecimal importe;
}
