package org.zarcia.prog5j2tp2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Long id;
    private String name;
    private boolean isAvalable;
    private Double pricePerDay;

}
