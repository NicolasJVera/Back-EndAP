package com.portfolio.njvp.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoSkills {
    @NotBlank
    private String nombre;
    
    @NotBlank
    private int porcentaje;

    public DtoSkills() {
    }

    public DtoSkills(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
}
