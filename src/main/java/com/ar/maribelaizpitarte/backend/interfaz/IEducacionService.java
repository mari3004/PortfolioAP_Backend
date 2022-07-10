package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Educacion;
import java.util.List;

public interface IEducacionService {
    
     //Traer una lista de Experiencia
    public List <Educacion> getEducacion (); 
    
    //Guardar un objeto de tipo Experiencia
    public void saveEducacion(Educacion educacion);
    
    //Eliminar una persona  por Id
    public void deleteEducacion(Long id);
    
    //Buscar una persona por Id
    public Educacion findEducacion (Long id);
}
