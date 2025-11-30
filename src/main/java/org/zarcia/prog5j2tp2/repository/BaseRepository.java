package org.zarcia.prog5j2tp2.repository;

public interface BaseRepository<T> {
    T save(T entity);           // insert OR update
    Optional<T> findById(Long id);
    List<T> findAll();
    boolean deleteById(Long id);
}
