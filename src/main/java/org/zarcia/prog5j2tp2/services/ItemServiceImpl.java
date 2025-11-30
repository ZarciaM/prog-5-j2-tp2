package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.ItemResponseDto;
import org.zarcia.prog5j2tp2.entity.Item;
import org.zarcia.prog5j2tp2.repository.ItemRepository;
import org.zarcia.prog5j2tp2.services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemServices {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemResponseDto> getAllItems() {
        List<Item> items = itemRepository.findAll();


        return items.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ItemResponseDto getItemById(Long id) {

        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));
        return convertToDto(item);
    }

    private ItemResponseDto convertToDto(Item item) {
        ItemResponseDto dto = new ItemResponseDto();

        dto.setName(item.getName());
        dto.setAvalable(item.isAvalable());
        dto.setPricePerDay(item.getPricePerDay());
        return dto;
    }
}