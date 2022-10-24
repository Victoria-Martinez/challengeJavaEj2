package com.challenge.challengeJavaEj2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class TarjetaCredito {

    Marca marca;
    String numero;
    CardHolder cardHolder;
    LocalDate vencimiento;
}
