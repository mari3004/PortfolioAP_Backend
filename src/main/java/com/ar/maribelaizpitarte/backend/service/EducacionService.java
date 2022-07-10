package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Educacion;
import com.ar.maribelaizpitarte.backend.interfaz.IEducacionService;
import com.ar.maribelaizpitarte.backend.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducacionService implements IEducacionService {
    @Autowired IEducacionRepository ieducacionRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Educacion> getEducacion() {
        return (List <Educacion>) ieducacionRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEducacion(Educacion educacion) {
       ieducacionRepository.save(educacion);
    }

    @Override
    @Transactional
    public void deleteEducacion(Long id) {
        ieducacionRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionRepository.findById(id) .orElse(null);
                return educacion;
    }
    
}
