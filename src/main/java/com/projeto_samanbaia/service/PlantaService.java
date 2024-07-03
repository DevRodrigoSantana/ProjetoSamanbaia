package com.projeto_samanbaia.service;

import com.projeto_samanbaia.entity.Planta;
import com.projeto_samanbaia.repository.PlantaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@RequiredArgsConstructor
@Service
public class PlantaService {

    private final PlantaRepository repository;

    @Transactional(readOnly = true)
    public Planta buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("id Nao encontrado"));
    }
}
