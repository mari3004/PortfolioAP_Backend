package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Experiencia;
import com.ar.maribelaizpitarte.backend.interfaz.IExperienciaService;
import com.ar.maribelaizpitarte.backend.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired IExperienciaRepository iexperienciaRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Experiencia> getExperiencia() {
        return (List <Experiencia>) iexperienciaRepository.findAll();
    }
    
    @Override
    @Transactional (readOnly = true)
    public Experiencia findById(Long id) {
        return iexperienciaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void saveExperiencia(Experiencia experiencia) {
       iexperienciaRepository.save(experiencia);
    }

    @Override
    @Transactional
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id) .orElse(null);
                return experiencia;
    }
    
}
