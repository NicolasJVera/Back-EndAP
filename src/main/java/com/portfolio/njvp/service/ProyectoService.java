package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Proyecto;
import com.portfolio.njvp.repository.ProyectoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService {

    @Autowired
    ProyectoRepo proyectoRepo;

    @Override
    public void deleteProyecto(int id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);

    }

    @Override
    public Proyecto traerProyectoPorId(int id) {
        Proyecto pro = proyectoRepo.findById(id).orElse(null);
        return pro;
    }

    @Override
    public List<Proyecto> traerProyectos() {
        List<Proyecto> proyectos = proyectoRepo.findAll();
        return proyectos;
    }
}
