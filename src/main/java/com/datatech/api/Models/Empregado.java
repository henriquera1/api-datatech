package com.datatech.api.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Matricula;
    
    @Column(nullable = false)
    private String Nome;
    
    @Column(nullable = false)
    private String Sexo;
    
    
    public Integer getMatricula() {
        return Matricula;
    }
    public void setMatricula(Integer matricula) {
        Matricula = matricula;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    
}
