package com.attornatus.springBootApi.repositories;

import com.attornatus.springBootApi.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
