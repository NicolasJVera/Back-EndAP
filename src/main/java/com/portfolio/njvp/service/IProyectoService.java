package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Proyecto;
import java.util.List;

public interface IProyectoService {

    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(int id);

    public List<Proyecto> traerProyectos();

    public Proyecto traerProyectoPorId(int id);
}
