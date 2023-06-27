package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Skills;
import com.portfolio.njvp.repository.SkillsRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {

    @Autowired
    SkillsRepo skillsRepo;

    public List<Skills> list() {
        return skillsRepo.findAll();
    }

    public Optional<Skills> getOne(int id) {
        return skillsRepo.findById(id);
    }

    public Optional<Skills> getByNombre(String nombre) {
        return skillsRepo.findByNombre(nombre);
    }

    public void save(Skills educacion) {
        skillsRepo.save(educacion);
    }

    public void delete(int id) {
        skillsRepo.deleteById(id);
    }

    public boolean existsById(int id) {
        return skillsRepo.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return skillsRepo.existsByNombre(nombre);
    }
}
