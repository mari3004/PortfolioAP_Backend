package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Usuario;
import com.ar.maribelaizpitarte.backend.interfaz.IUsuarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class UsuarioController {
    
    @Autowired IUsuarioService iusuarioService;
    
    @GetMapping ("/usuario/traer")
    public List <Usuario> getUsuario(){
        return iusuarioService.getUsuario();
    }
    
    @PostMapping ("/usuario/crear")
    public String crearUsuario(@RequestBody Usuario usuario){
    iusuarioService.saveUsuario(usuario);
    return "El Usuario fue creado correctamente";    
    }
    
    @DeleteMapping ("/usuario/borrar/{id}")
    public String borrarUsuario(@PathVariable Long id){
        iusuarioService.deleteUsuario(id);
        return "El Usuario fue eliminado correctamente";
    }

    @PutMapping ("/usuario/editar/{id}")
    public Usuario editarUsuario (@PathVariable Long id, 
                                  @RequestParam ("usuario") String newUsuario,
                                  @RequestParam ("contrasena") String newContrasena){
        
    Usuario usuario = iusuarioService.findUsuario(id);
    
    usuario.setUsuario (newUsuario);
    usuario.setContrasena (newContrasena);
    
    
    iusuarioService.saveUsuario(usuario);
    return usuario;
}
    
}

