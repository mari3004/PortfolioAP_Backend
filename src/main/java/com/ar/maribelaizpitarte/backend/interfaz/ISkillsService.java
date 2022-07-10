package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Skills;
import java.util.List;

public interface ISkillsService {
    
     //Traer una lista de Experiencia
    public List <Skills> getSkills (); 
    
    //Guardar un objeto de tipo Experiencia
    public void saveSkills (Skills skills);
    
    //Eliminar una persona  por Id
    public void deleteSkills(Long id);
    
    //Buscar una persona por Id
    public Skills findSkills (Long id);
}