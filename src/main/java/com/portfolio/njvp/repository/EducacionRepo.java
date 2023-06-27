package com.portfolio.njvp.repository;

import com.portfolio.njvp.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

}
