package com.ar.maribelaizpitarte.backend.repository;

import com.ar.maribelaizpitarte.backend.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository <Skills, Long> {
    
}