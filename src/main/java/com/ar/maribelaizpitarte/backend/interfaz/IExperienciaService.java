package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
     //Traer una lista de Experiencia
    public List <Experiencia> getExperiencia (); 
    
    //Guardar un objeto de tipo Experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar una persona  por Id
    public void deleteExperiencia(Long id);
    
    //Buscar una persona por Id
    public Experiencia findExperiencia (Long id);
}

