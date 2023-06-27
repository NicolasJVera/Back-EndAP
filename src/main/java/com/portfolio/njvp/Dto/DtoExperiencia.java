package com.portfolio.njvp.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoExperiencia {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    private String duracion;

    private String imagen;

    //Constructores
    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreE, String descripcionE, String duracion, String imagen) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.duracion = duracion;
        this.imagen = imagen;
    }

}
