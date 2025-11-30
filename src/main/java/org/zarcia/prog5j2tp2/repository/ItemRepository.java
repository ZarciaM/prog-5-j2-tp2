
package org.zarcia.prog5j2tp2.repository;

import org.zarcia.prog5j2tp2.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findAll();
    Optional<Item> findById(Long id);

}