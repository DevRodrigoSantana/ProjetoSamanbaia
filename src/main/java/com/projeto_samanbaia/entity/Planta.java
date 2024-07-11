package com.projeto_samanbaia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Plantas")
public class Planta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "nome",nullable = false)
        private String nome;
        @Column(name = "umidade_solo")
        private String umidadeSolo;
        @Column(name = "umidade_ar")
        private String umidadeAr;
        @Column(name = "temperatura")
        private String temperatura;
}
