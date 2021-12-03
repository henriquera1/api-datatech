package com.datatech.api.Controllers;

import java.util.List;
import java.util.Optional;

import com.datatech.api.Models.Empregado;
import com.datatech.api.Repository.EmpregadoRepository;

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
@RequestMapping("v1/empregado")
public class EmpregadoController {
    
    @Autowired
    private EmpregadoRepository repository;


    @GetMapping
    public List<Empregado> GetEmpregado(){
        
        return repository.findAll();
    
    }

    @GetMapping("/{matricula}")
    public Optional<Empregado> GetEmpregadoById(@PathVariable Integer matricula){
        return repository.findById(matricula);
    }

    @PostMapping
    public void PostEmpregado(@RequestBody Empregado empregado){

        repository.save(empregado);
    
    }

    @PutMapping
    public void PutEmpregado(@RequestBody Empregado empregado){

        if(empregado.getMatricula() > 0)
            repository.save(empregado);
    
    } 

    @DeleteMapping("/{matricula}")
    public ResponseEntity<String> DeleteTreinamentoById(@PathVariable Integer matricula){

        repository.deleteById(matricula);
        return ResponseEntity.ok("Treinamento com código: " +matricula + " deletado com sucesso!");
    }



}
