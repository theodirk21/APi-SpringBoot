package com.attornatus.springBootApi.repositories;

import com.attornatus.springBootApi.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
