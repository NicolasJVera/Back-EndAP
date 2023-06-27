package com.portfolio.njvp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreE;
    
    private String descripcionE;
    
    private String duracion;
    
    private String imagen;

    public Educacion() {

    }

    public Educacion(String nombreE, String descripcionE, String duracion, String imagen) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.duracion = duracion;
        this.imagen = imagen;
    }
    
    
}
