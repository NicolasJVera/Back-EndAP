
package com.portfolio.njvp.repository;

import com.portfolio.njvp.entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer>{
    Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
