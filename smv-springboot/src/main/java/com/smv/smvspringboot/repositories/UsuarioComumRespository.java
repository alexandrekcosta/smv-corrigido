package com.smv.smvspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smv.smvspringboot.entidade.UsuarioComumEntity;

public interface UsuarioComumRespository extends JpaRepository<UsuarioComumEntity, Long> {

}
