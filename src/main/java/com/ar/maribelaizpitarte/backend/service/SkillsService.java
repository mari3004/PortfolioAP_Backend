package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Skills;
import com.ar.maribelaizpitarte.backend.interfaz.ISkillsService;
import com.ar.maribelaizpitarte.backend.repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SkillsService implements ISkillsService {
    @Autowired ISkillsRepository iskillsRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Skills> getSkills() {
        return (List <Skills>) iskillsRepository.findAll();
    }

    @Override
    @Transactional
    public void saveSkills(Skills skills) {
       iskillsRepository.save(skills);
    }

    @Override
    @Transactional
    public void deleteSkills(Long id) {
        iskillsRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Skills findSkills(Long id) {
        Skills skills = iskillsRepository.findById(id) .orElse(null);
                return skills;
    }
    
}