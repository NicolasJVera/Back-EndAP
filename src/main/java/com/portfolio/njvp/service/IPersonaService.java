package com.portfolio.njvp.service;

import com.portfolio.njvp.entity.Persona;

public interface IPersonaService {

    public Persona traerPersona();

    public void savePersona(Persona persona);

    public void deletePersona(int id);

    public Persona editarPersona(Persona persona);
}
