package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Persona;
import com.portfolio.njvp.repository.PersonaRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {

    @Autowired
    PersonaRepo personaRepo;

    public List<Persona> list() {
        return personaRepo.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return personaRepo.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return personaRepo.findByNombre(nombre);
    }

    public void save(Persona educacion) {
        personaRepo.save(educacion);
    }

    public void delete(int id) {
        personaRepo.deleteById(id);
    }

    public boolean existsById(int id) {
        return personaRepo.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return personaRepo.existsByNombre(nombre);
    }
}
