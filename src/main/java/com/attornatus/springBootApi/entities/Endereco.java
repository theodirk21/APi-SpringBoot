package com.attornatus.springBootApi.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lougradouro;
    private Long cep;
    private Long numero;
    private String cidade;




}
