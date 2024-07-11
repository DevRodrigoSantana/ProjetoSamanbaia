package com.projeto_samanbaia.web.controller;

import com.projeto_samanbaia.entity.Planta;
import com.projeto_samanbaia.service.PlantaService;
import com.projeto_samanbaia.web.dto.PlantaDtoAlterarDados;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planta")
@RequiredArgsConstructor
public class PlantaController {

    private final PlantaService service;


    @GetMapping("/{id}")
    public ResponseEntity<Planta> verPlanta(@PathVariable Long id){
        Planta planta = service.buscarPorId(id);
        return ResponseEntity.ok(planta);
    }
    @PatchMapping("/{id}/alterar")
    public ResponseEntity<Void> alterarUmidade(@PathVariable Long id, @Valid @RequestBody PlantaDtoAlterarDados alterarDados){
        Planta planta = service.alterarPlantaPorId(id,
                                                alterarDados.getUmidadeArAtual(),
                                                alterarDados.getUmidadeSoloAtual(),
                                                alterarDados.getTemperaturaAtual());
        return  ResponseEntity.noContent().build();
    }
}
