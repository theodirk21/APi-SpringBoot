package com.attornatus.springBootApi.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String datadenascimento;

    @ManyToOne
    private Endereco enderecoPrimario;
    @ManyToOne
    private Endereco enderecoSecundario;

}
