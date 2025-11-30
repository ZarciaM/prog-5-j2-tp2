package org.zarcia.prog5j2tp2.controller;

import org.zarcia.prog5j2tp2.dto.MoneyResponseDto;
import org.zarcia.prog5j2tp2.services.MoneyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/money")
public class MoneyController {

    private final MoneyServices moneyService;

    @Autowired
    public MoneyController(MoneyServices moneyService) {
        this.moneyService = moneyService;
    }

    @GetMapping
    public ResponseEntity<List<MoneyResponseDto>> getAllMoney() {
        List<MoneyResponseDto> moneyList = moneyService.getAllMoney();
        return ResponseEntity.ok(moneyList);
    }



    @GetMapping("/{id}")
    public ResponseEntity<MoneyResponseDto> getMoneyById(@PathVariable Long id) {
        MoneyResponseDto money = moneyService.getMoneyById(id);
        return ResponseEntity.ok(money);
    }
}