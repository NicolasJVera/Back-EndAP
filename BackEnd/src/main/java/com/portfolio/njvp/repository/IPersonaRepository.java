package com.portfolio.njvp.repository;

import com.portfolio.njvp.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
    
    
    
    
}
