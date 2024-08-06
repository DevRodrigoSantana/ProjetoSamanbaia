package com.projeto_samanbaia.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PlantaDtoAlterarDados {

    
    @NotBlank
    private String umidadeSoloAtual;
    @NotBlank
    private String umidadeArAtual;
    @NotBlank
    private String temperaturaAtual;
}
