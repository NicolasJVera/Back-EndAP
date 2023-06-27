package com.portfolio.njvp.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoEducacion {

    private String nombreE;

    private String descripcionE;

    private String duracion;

    private String imagen;

    private String info;

    public DtoEducacion() {
    }  

    public DtoEducacion(String nombreE, String descripcionE, String duracion, String imagen, String info) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.duracion = duracion;
        this.imagen = imagen;
        this.info = info;
    }
    
    
}
