package org.zarcia.prog5j2tp2.dto;

import lombok.Getter;
import lombok.Setter;
import org.zarcia.prog5j2tp2.entity.RenterType;

@Getter
@Setter
public class RenterRequestDto {
    private String name;
    private String email;
    private RenterType type;
}