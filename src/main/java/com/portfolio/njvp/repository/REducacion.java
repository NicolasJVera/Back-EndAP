package com.portfolio.njvp.Repository;

import com.portfolio.njvp.Interfaces.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface REducacion extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion> findByNombreE(String nombreE);

    public boolean existsByNombreE(String nombreE);

}
