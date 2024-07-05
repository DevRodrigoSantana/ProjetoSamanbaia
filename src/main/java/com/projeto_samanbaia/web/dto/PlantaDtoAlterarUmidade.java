package com.projeto_samanbaia.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PlantaDtoAlterarUmidade {

    @NotBlank
    private String umidade;
}
