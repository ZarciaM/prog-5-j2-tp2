package org.zarcia.prog5j2tp2.repository;

import org.zarcia.prog5j2tp2.entity.Money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoneyRepository extends JpaRepository<Money, Long> {


    List<Money> findAll();

    Optional<Money> findById(Long id);
}