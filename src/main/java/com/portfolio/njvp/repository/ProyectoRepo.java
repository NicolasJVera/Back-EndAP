package com.portfolio.njvp.repository;

import com.portfolio.njvp.entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {

    Optional<Proyecto> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
