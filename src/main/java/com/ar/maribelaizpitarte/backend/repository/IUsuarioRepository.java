package com.ar.maribelaizpitarte.backend.repository;

import com.ar.maribelaizpitarte.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> {
    
}