package com.projeto_samanbaia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "plantas")
public class Planta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "nome", nullable = false)
        private String nome;

        @Column(name = "umidade_solo", nullable = false)
        private String umidadeSolo;

        @Column(name = "umidade_ar",nullable = false)
        private String umidadeAr;

        @Column(name = "temperatura",nullable = false)
        private String temperatura;

        @Column(name = "sobre",nullable = false,length = 255)
        private String sobre;
}
