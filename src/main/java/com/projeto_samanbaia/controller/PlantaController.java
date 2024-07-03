package com.projeto_samanbaia.controller;

import com.projeto_samanbaia.entity.Planta;
import com.projeto_samanbaia.service.PlantaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planta")
@RequiredArgsConstructor
public class PlantaController {

    private PlantaService service;

    @GetMapping("/{id}")
    public ResponseEntity<Planta> verPlanta(@PathVariable Long id){
        Planta planta = service.buscarPorId(id);
        return ResponseEntity.ok().body(planta);
    }
}
