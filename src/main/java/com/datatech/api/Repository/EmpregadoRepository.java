package com.datatech.api.Repository;

import com.datatech.api.Models.Empregado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregadoRepository extends JpaRepository<Empregado, Integer>{
    
}
