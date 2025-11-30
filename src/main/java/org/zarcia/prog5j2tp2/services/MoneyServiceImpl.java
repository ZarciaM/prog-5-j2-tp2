package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.MoneyResponseDto;
import org.zarcia.prog5j2tp2.entity.Money;
import org.zarcia.prog5j2tp2.repository.MoneyRepository;
import org.zarcia.prog5j2tp2.services.MoneyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoneyServiceImpl implements MoneyServices {

    private final MoneyRepository moneyRepository;

    @Autowired
    public MoneyServiceImpl(MoneyRepository moneyRepository) {
        this.moneyRepository = moneyRepository;
    }

    @Override
    public List<MoneyResponseDto> getAllMoney() {
        return moneyRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MoneyResponseDto getMoneyById(Long id) {
        Money money = moneyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Money not found with ID: " + id));
        return convertToDto(money);
    }

    private MoneyResponseDto convertToDto(Money money) {
        MoneyResponseDto dto = new MoneyResponseDto();

        dto.setAmount(money.getAmount());
        dto.setInterestRate(money.getInterestRate());
        dto.setAvailable(money.isAvailable());
        dto.setMoneyToPay(money.getMoneyToPay());
        return dto;
    }
}
