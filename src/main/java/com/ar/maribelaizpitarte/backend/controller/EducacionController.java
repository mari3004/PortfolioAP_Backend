package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Educacion;
import com.ar.maribelaizpitarte.backend.interfaz.IEducacionService;
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
@CrossOrigin (origins = "https://apfrontend-2d469.web.app/experience")
public class EducacionController {
    
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping ("/educacion/traer")
    public List <Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping ("/educacion/crear")
    public String crearEducacion(@RequestBody Educacion educacion){
    ieducacionService.saveEducacion(educacion);
    return "La Educacion fue creada correctamente";    
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "La Educacion fue eliminada correctamente";
    }

    @PutMapping ("/educacion/editar/{id}")
    public Educacion editarEducacion (@PathVariable Long id, 
                                  @RequestParam ("titulo") String newTitulo,
                                  @RequestParam ("establecimiento") String newEstablecimiento,
                                  @RequestParam ("fechadeingreso") String newFechadeingreso,
                                  @RequestParam ("fechadeegreso") String newFechadeegreso){
    Educacion educacion = ieducacionService.findEducacion(id);
    
    educacion.setTitulo (newTitulo);
    educacion.setEstablecimiento (newEstablecimiento);
    educacion.setFechadeingreso (newFechadeingreso);
    educacion.setFechadeegreso (newFechadeegreso);
    
    
    ieducacionService.saveEducacion(educacion);
    return educacion;
}
    
}


