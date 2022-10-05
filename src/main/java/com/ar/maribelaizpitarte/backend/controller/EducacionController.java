package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.Mod.EducacionM;
import com.ar.maribelaizpitarte.backend.entity.Educacion;
import com.ar.maribelaizpitarte.backend.interfaz.IEducacionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins= {"https://apfrontend-2d469.web.app"})
@RequestMapping("/api")
public class EducacionController {
    
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping ("/educacion")
    public List <Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @GetMapping("/educacion/{id}")
    public Educacion show(@PathVariable Long id) {
        return ieducacionService.findById(id);
    }
    
    @PostMapping ("/educacion")
    @ResponseStatus (HttpStatus.CREATED)
    public String crearEducacion(@RequestBody Educacion educacion){
    ieducacionService.saveEducacion(educacion);
    return "La Educacion fue creada correctamente";    
    }
    
    @DeleteMapping ("/educacion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String borrarEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "La Educacion fue eliminada correctamente";
    }

    @PutMapping ("/educacion/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Educacion editarEducacion (@RequestBody EducacionM educacionm,
                                      @PathVariable Long id){

        Educacion eduActual = ieducacionService.findEducacion(id);
    
    eduActual.setTitulo (educacionm.getTitulo());
    eduActual.setEstablecimiento (educacionm.getEstablecimiento());
    eduActual.setFechadeingreso (educacionm.getFechadeingreso());
    eduActual.setFechadeegreso (educacionm.getFechadeegreso());
    
    
    ieducacionService.saveEducacion(eduActual);
    return new Educacion();
    }
 
}


