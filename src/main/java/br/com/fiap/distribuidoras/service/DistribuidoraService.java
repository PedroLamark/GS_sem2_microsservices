package br.com.fiap.distribuidoras.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.distribuidoras.model.Distribuidora;
import br.com.fiap.distribuidoras.repository.DistribuidoraRepository;


@Service
public class DistribuidoraService {

    @Autowired
    private DistribuidoraRepository distribuidoraRepository;

    public List<Distribuidora> list() {
        return distribuidoraRepository.findAll();
    }

    public Distribuidora save(Distribuidora distribuidora) {
        return distribuidoraRepository.save(distribuidora);
    }

    public boolean existsById(Long id) {
        return distribuidoraRepository.existsById(id);
    }

    public void delete(Long id) {
        distribuidoraRepository.deleteById(id);
    }

    public Optional<Distribuidora> findById(Long id) {
        return distribuidoraRepository.findById(id);
    }
}
