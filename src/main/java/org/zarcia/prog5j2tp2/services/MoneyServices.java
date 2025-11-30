package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.MoneyResponseDto;

import java.util.List;

public interface MoneyServices {
    List<MoneyResponseDto> getAllMoney();
    MoneyResponseDto getMoneyById(Long id);
}