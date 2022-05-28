
package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Persona;
import com.ar.maribelaizpitarte.backend.interfaz.IPersonaService;
import com.ar.maribelaizpitarte.backend.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImpPersonaSrv implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Persona> getPersona() {
        return (List <Persona>) ipersonaRepository.findAll();
    }

    @Override
    @Transactional
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    @Transactional
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id) .orElse(null);
                return persona;
    }
    
}
