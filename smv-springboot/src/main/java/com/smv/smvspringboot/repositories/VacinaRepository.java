package com.smv.smvspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smv.smvspringboot.entidade.VacinaEntity;

public interface VacinaRepository extends JpaRepository<VacinaEntity, Long> {

}
