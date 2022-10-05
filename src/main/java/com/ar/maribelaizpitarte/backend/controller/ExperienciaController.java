package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.Mod.ExperienciaM;
import com.ar.maribelaizpitarte.backend.entity.Experiencia;
import com.ar.maribelaizpitarte.backend.interfaz.IExperienciaService;
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
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping ("/experiencia")
    public List <Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    @GetMapping("/experiencia/{id}")
    public Experiencia show(@PathVariable Long id) {
        return iexperienciaService.findById(id);
    }
    
    @PostMapping ("/experiencia")
    @ResponseStatus (HttpStatus.CREATED)
    public String crearExperiencia(@RequestBody Experiencia experiencia){
    iexperienciaService.saveExperiencia(experiencia);
    return "La Experiencia fue creada correctamente";    
    }
    
    @DeleteMapping ("/experiencia/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String borrarExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La Experiencia fue eliminada correctamente";
    }

    @PutMapping ("/experiencia/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Experiencia editarExperiencia (@RequestBody ExperienciaM experienciam,
                                         @PathVariable Long id){
        
    Experiencia expActual = iexperienciaService.findExperiencia(id);
    
    expActual.setEmpresa (experienciam.getEmpresa());
    expActual.setRol (experienciam.getRol());
    expActual.setFechadeingreso (experienciam.getFechadeingreso());
    expActual.setFechadeegreso (experienciam.getFechadeegreso());
    expActual.setTarea1 (experienciam.getTarea1());
    expActual.setTarea2 (experienciam.getTarea2());
    expActual.setTarea3 (experienciam.getTarea3());
    expActual.setTarea4 (experienciam.getTarea4());
    expActual.setTarea5 (experienciam.getTarea5());
    expActual.setTarea6 (experienciam.getTarea6());
    expActual.setTarea7 (experienciam.getTarea7());
    expActual.setTarea8 (experienciam.getTarea8());
    expActual.setTarea9 (experienciam.getTarea9());
    
    
    iexperienciaService.saveExperiencia(expActual);
    return new Experiencia();
    }
}
