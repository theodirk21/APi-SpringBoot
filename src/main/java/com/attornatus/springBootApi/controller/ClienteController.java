package com.attornatus.springBootApi.controller;



import com.attornatus.springBootApi.entities.Cliente;
import com.attornatus.springBootApi.repositories.ClienteRepository;
import com.attornatus.springBootApi.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> findAll(){
        List<Cliente> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable Long id){
        Cliente result = repository.findById(id).get();
        return result;
    }
    @PostMapping
    public Cliente insert(@RequestBody Cliente endereco){
        Cliente result = repository.save(endereco);
        return result;
    }
}
