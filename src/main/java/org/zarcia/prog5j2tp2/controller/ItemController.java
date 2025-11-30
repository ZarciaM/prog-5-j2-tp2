package org.zarcia.prog5j2tp2.controller;

import org.zarcia.prog5j2tp2.dto.ItemResponseDto;
import org.zarcia.prog5j2tp2.services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items") // URL de base pour ce contrôleur
public class ItemController {

    private final ItemServices itemService;

    @Autowired
    public ItemController(ItemServices itemService) {
        this.itemService = itemService;
    }


    @GetMapping
    public ResponseEntity<List<ItemResponseDto>> getAllItems() {
        List<ItemResponseDto> items = itemService.getAllItems();
        return ResponseEntity.ok(items); // Code HTTP 200 OK
    }


    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDto> getItemById(@PathVariable Long id) {
        ItemResponseDto item = itemService.getItemById(id);

        return ResponseEntity.ok(item);
    }
}