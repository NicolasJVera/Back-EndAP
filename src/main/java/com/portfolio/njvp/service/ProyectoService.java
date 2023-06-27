package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Proyecto;
import com.portfolio.njvp.repository.ProyectoRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepo proyectoRepo;

    public List<Proyecto> list() {
        return proyectoRepo.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return proyectoRepo.findById(id);
    }

    public Optional<Proyecto> getByNombre(String nombre) {
        return proyectoRepo.findByNombre(nombre);
    }

    public void save(Proyecto educacion) {
        proyectoRepo.save(educacion);
    }

    public void delete(int id) {
        proyectoRepo.deleteById(id);
    }

    public boolean existsById(int id) {
        return proyectoRepo.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return proyectoRepo.existsByNombre(nombre);
    }
}
