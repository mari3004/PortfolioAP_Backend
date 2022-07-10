package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Proyectos;
import java.util.List;

public interface IProyectosService {
    
     //Traer una lista de Experiencia
    public List <Proyectos> getProyectos (); 
    
    //Guardar un objeto de tipo Experiencia
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar una persona  por Id
    public void deleteProyectos(Long id);
    
    //Buscar una persona por Id
    public Proyectos findProyectos (Long id);
}
