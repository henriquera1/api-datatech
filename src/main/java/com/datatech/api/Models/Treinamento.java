package com.datatech.api.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treinamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Codigo;

    @Column(nullable = false)
    private String Descricao;

    @Column(nullable = false)
    private Date Inicio;

    @Column(nullable = false)
    private Date Fim;

    @Column(nullable = false)
    private Integer CargaHoraria;

    @Column(nullable = false)
    private Integer Vagas;

    
    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date inicio) {
        Inicio = inicio;
    }

    public Date getFim() {
        return Fim;
    }

    public void setFim(Date fim) {
        Fim = fim;
    }

    public Integer getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public Integer getVagas() {
        return Vagas;
    }

    public void setVagas(Integer vagas) {
        Vagas = vagas;
    }


}
