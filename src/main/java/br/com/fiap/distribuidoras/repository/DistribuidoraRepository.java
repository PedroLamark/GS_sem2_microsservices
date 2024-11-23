package br.com.fiap.distribuidoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.distribuidoras.model.Distribuidora;

@Repository
public interface DistribuidoraRepository extends JpaRepository<Distribuidora, Long>{

    
}
