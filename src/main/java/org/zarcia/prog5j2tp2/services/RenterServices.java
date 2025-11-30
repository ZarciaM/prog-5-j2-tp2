package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.RenterResponseDto;

import java.util.List;

public interface RenterServices {
    List<RenterResponseDto> getAllRenter();
    RenterResponseDto getRenterById(Long id);
}