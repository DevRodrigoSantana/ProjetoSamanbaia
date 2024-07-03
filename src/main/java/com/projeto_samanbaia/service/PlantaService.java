package com.projeto_samanbaia.service;

import com.projeto_samanbaia.entity.Planta;
import com.projeto_samanbaia.repository.PlantaRepository;
import org.springframework.transaction.annotation.Transactional;

public class PlantaService {

    private PlantaRepository repository;

    @Transactional(readOnly = true)
    public Planta buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("id Nao encontrado"));
    }
}
