package org.zarcia.prog5j2tp2.services;

import org.zarcia.prog5j2tp2.dto.RenterResponseDto;
import org.zarcia.prog5j2tp2.entity.Renter;
import org.zarcia.prog5j2tp2.repository.RenterRepository;
import org.zarcia.prog5j2tp2.services.RenterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RenterServiceImpl implements RenterServices {

    private final RenterRepository renterRepository;

    @Autowired
    public RenterServiceImpl(RenterRepository renterRepository) {
        this.renterRepository = renterRepository;
    }

    @Override
    public List<RenterResponseDto> getAllRenter() {
        return renterRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public RenterResponseDto getRenterById(Long id) {
        Renter renter = renterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Renter not found with ID: " + id));
        return convertToDto(renter);
    }

    private RenterResponseDto convertToDto(Renter renter) {
        RenterResponseDto dto = new RenterResponseDto();

        dto.setName(renter.getName());
        dto.setEmail(renter.getEmail());
        dto.setType(renter.getType());
        return dto;
    }
}