package com.ar.maribelaizpitarte.backend.interfaz;

import com.ar.maribelaizpitarte.backend.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    
     //Traer una lista de Experiencia
    public List <Usuario> getUsuario (); 
    
    //Guardar un objeto de tipo Experiencia
    public void saveUsuario (Usuario usuario);
    
    //Eliminar una persona  por Id
    public void deleteUsuario(Long id);
    
    //Buscar una persona por Id
    public Usuario findUsuario(Long id);
}
