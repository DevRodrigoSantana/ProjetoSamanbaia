package com.projeto_samanbaia.web.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PlantaCreate {

    String umidadeDoSolo;
    String umidadeDoAr;
    String temperatura;
    String nome;
    String sobre;
}
