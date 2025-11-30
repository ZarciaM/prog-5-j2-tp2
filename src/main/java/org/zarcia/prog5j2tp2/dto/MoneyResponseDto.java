package org.zarcia.prog5j2tp2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoneyResponseDto {
    private Long id;
    private double amount;
    private double interestRate;
    private boolean isAvailable;
    private double moneyToPay;
}