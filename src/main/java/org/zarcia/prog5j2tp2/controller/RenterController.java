package org.zarcia.prog5j2tp2.controller;

import org.zarcia.prog5j2tp2.dto.RenterResponseDto;
import org.zarcia.prog5j2tp2.services.RenterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/renters")
public class RenterController {

    private final RenterServices renterService;

    @Autowired
    public RenterController(RenterServices renterService) {
        this.renterService = renterService;
    }

    @GetMapping
    public ResponseEntity<List<RenterResponseDto>> getAllRenter() {
        List<RenterResponseDto> renters = renterService.getAllRenter();
        return ResponseEntity.ok(renters);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RenterResponseDto> getRenterById(@PathVariable Long id) {
        RenterResponseDto renter = renterService.getRenterById(id);
        return ResponseEntity.ok(renter);
    }
}