package com.attornatus.springBootApi.controller;

import com.attornatus.springBootApi.entities.Cliente;
import com.attornatus.springBootApi.entities.Endereco;
import com.attornatus.springBootApi.repositories.ClienteRepository;
import com.attornatus.springBootApi.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository repository;

    @GetMapping
    public List<Endereco> findAll(){
        List<Endereco> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Endereco findById(@PathVariable Long id){
        Endereco result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Endereco insert(@RequestBody Endereco endereco){
        Endereco result = repository.save(endereco);
        return result;
    }
}
