package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.ItemResponseDto;

import java.util.List;

public interface ItemServices {

    List<ItemResponseDto> getAllItems();

    ItemResponseDto getItemById(Long id);
}
