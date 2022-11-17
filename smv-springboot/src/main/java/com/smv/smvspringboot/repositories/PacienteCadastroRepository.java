package com.smv.smvspringboot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.smv.smvspringboot.entidade.PacienteCadastroEntity; 

public interface PacienteCadastroRepository extends JpaRepository<PacienteCadastroEntity, Long> {



}
