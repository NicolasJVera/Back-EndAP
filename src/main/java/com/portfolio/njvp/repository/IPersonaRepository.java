package com.portfolio.njvp.Repository;

import com.portfolio.njvp.Interfaces.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
    
    
    
    
}
