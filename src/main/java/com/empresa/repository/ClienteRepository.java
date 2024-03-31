package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Cliente;
import com.empresa.entity.Modalidad;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
