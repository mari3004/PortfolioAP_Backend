package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List <Persona> getPersona (); 
    
    public Persona findById(Long id);
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona  por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona (Long id);
}
