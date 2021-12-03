package com.datatech.api.Controllers;

import java.util.List;
import java.util.Optional;

import com.datatech.api.Models.Treinamento;
import com.datatech.api.Repository.TreinamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/treinamento")
public class TreinamentoController {

    @Autowired
    private TreinamentoRepository repository;


    @GetMapping
    public List<Treinamento> GetTreinamento(){
        
        return repository.findAll();
    
    }

    @GetMapping("/{codigo}")
    public Optional<Treinamento> GetTreinamentoById(@PathVariable Integer codigo){
        return repository.findById(codigo);
    }

    @PostMapping
    public void PostTreinamento(@RequestBody Treinamento treinamento){

        repository.save(treinamento);
    
    }

    @PutMapping
    public void PutTreinamento(@RequestBody Treinamento treinamento){

        if(treinamento.getCodigo() > 0)
            repository.save(treinamento);
    
    } 

    @DeleteMapping("/{codigo}")
    public ResponseEntity<String> DeleteTreinamentoById(@PathVariable Integer codigo){

        repository.deleteById(codigo);
        return ResponseEntity.ok("Treinamento com código: " +codigo + " deletado com sucesso!");
    }
    
}
