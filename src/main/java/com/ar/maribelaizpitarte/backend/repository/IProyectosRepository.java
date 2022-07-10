package com.ar.maribelaizpitarte.backend.repository;

import com.ar.maribelaizpitarte.backend.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
