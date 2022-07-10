package com.ar.maribelaizpitarte.backend.repository;

import com.ar.maribelaizpitarte.backend.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}

