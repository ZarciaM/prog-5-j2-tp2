package org.zarcia.prog5j2tp2.dto;

import lombok.Getter;
import lombok.Setter;
import org.zarcia.prog5j2tp2.entity.ItemType;

@Getter
@Setter
public class ItemRequestDto {

    private String name;
    private Double pricePerDay;

}