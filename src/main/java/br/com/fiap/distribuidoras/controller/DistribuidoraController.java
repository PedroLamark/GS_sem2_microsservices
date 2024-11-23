package br.com.fiap.distribuidoras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.distribuidoras.dtos.DistribuidoraRequestCreateDto;
import br.com.fiap.distribuidoras.dtos.DistribuidoraRequestUpdateDto;
import br.com.fiap.distribuidoras.dtos.DistribuidoraResponseDto;
import br.com.fiap.distribuidoras.mapper.DistribuidoraMapper;
import br.com.fiap.distribuidoras.service.DistribuidoraService;


@RestController
@RequestMapping("/distribuidoras")
public class DistribuidoraController {

    @Autowired
    private DistribuidoraMapper distribuidoraMapper;

    @Autowired
    private DistribuidoraService distribuidoraService;

    @GetMapping
    public ResponseEntity<List<DistribuidoraResponseDto>> list() {
        List<DistribuidoraResponseDto> dtos = distribuidoraService.list()
                .stream()
                .map(e -> new DistribuidoraResponseDto().toDto(e))
                .toList();

        return ResponseEntity.ok().body(dtos);
    }

    @PostMapping
    public ResponseEntity<DistribuidoraResponseDto> create(@RequestBody DistribuidoraRequestCreateDto dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        distribuidoraMapper.toDto(
                                distribuidoraService.save(distribuidoraMapper.toModel(dto))));
    }

    @PutMapping("{id}")
    public ResponseEntity<DistribuidoraResponseDto> update(
            @PathVariable Long id,
            @RequestBody DistribuidoraRequestUpdateDto dto) {
        if (!distribuidoraService.existsById(id)) {
            throw new RuntimeException("Id inexistente");
        }
        return ResponseEntity.ok()
                .body(
                        new DistribuidoraResponseDto().toDto(
                                distribuidoraService.save(dto.toModel())));
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        if (!distribuidoraService.existsById(id)) {
            throw new RuntimeException("Id inexistente");
        }

        distribuidoraService.delete(id);
    }

    @GetMapping("{id}")
    public ResponseEntity<DistribuidoraResponseDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok()
                .body(
                        distribuidoraService
                                .findById(id)
                                .map(e -> distribuidoraMapper.toDto(e))
                                .orElseThrow(() -> new RuntimeException("Id inexistente")));

    }
    
}
