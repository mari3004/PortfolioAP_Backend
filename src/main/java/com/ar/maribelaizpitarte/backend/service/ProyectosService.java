package com.ar.maribelaizpitarte.backend.service;

import com.ar.maribelaizpitarte.backend.entity.Proyectos;
import com.ar.maribelaizpitarte.backend.interfaz.IProyectosService;
import com.ar.maribelaizpitarte.backend.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProyectosService implements IProyectosService {
    @Autowired IProyectosRepository iproyectosRepository;

    
    @Override
    @Transactional (readOnly = true)
    public List<Proyectos> getProyectos() {
        return (List <Proyectos>) iproyectosRepository.findAll();
    }

    @Override
    @Transactional
    public void saveProyectos(Proyectos proyectos) {
       iproyectosRepository.save(proyectos);
    }

    @Override
    @Transactional
    public void deleteProyectos(Long id) {
        iproyectosRepository.deleteById(id);
    }

    @Override
    @Transactional (readOnly = true)
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = iproyectosRepository.findById(id) .orElse(null);
                return proyectos;
    }
    
}