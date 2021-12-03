package com.datatech.api.Repository;

import com.datatech.api.Models.Treinamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinamentoRepository extends JpaRepository<Treinamento, Integer> {
    
}
