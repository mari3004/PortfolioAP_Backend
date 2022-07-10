package com.ar.maribelaizpitarte.backend.repository;

import com.ar.maribelaizpitarte.backend.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long> {
    
}