package br.com.fiap.distribuidoras.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.distribuidoras.dtos.DistribuidoraRequestCreateDto;
import br.com.fiap.distribuidoras.dtos.DistribuidoraRequestUpdateDto;
import br.com.fiap.distribuidoras.dtos.DistribuidoraResponseDto;
import br.com.fiap.distribuidoras.model.Distribuidora;

@Component
public class DistribuidoraMapper {
    @Autowired
    private ModelMapper modelMapper;

    public DistribuidoraResponseDto toDto(Distribuidora distribuidora) {
        return modelMapper.map(distribuidora, DistribuidoraResponseDto.class);
    }

    public Distribuidora toModel(DistribuidoraRequestCreateDto dto) {
        return modelMapper.map(dto, Distribuidora.class);
    }

    public Distribuidora toModel(Long id, DistribuidoraRequestUpdateDto dto) {
        Distribuidora result = modelMapper.map(dto, Distribuidora.class);
        result.setId(id);
        return result;
    }

}

