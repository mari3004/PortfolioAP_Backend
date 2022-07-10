package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Proyectos;
import com.ar.maribelaizpitarte.backend.interfaz.IProyectosService;
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
public class ProyectosController {
    
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping ("/proyectos/traer")
    public List <Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping ("/proyectos/crear")
    public String crearProyectos(@RequestBody Proyectos proyectos){
    iproyectosService.saveProyectos(proyectos);
    return "El Proyecto fue creado correctamente";    
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String borrarProyectos(@PathVariable Long id){
        iproyectosService.deleteProyectos(id);
        return "El Proyecto fue eliminado correctamente";
    }

    @PutMapping ("/proyectos/editar/{id}")
    public Proyectos editarProyectos (@PathVariable Long id, 
                                  @RequestParam ("nombre_proyecto") String newNombre_proyecto,
                                  @RequestParam ("tecnologia") String newTecnologia){
        
    Proyectos proyectos = iproyectosService.findProyectos(id);
    
    proyectos.setNombre_proyecto (newNombre_proyecto);
    proyectos.setTecnologia (newTecnologia);
    
    
    iproyectosService.saveProyectos(proyectos);
    return proyectos;
}
    
}


