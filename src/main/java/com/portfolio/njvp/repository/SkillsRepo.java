package com.portfolio.njvp.repository;

import com.portfolio.njvp.entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Integer> {
    Optional<Skills> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
