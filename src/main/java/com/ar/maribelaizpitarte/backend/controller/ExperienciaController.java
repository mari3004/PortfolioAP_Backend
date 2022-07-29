package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Experiencia;
import com.ar.maribelaizpitarte.backend.interfaz.IExperienciaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins= "https://apfrontend-2d469.web.app")
@RequestMapping("/api")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping ("/experiencia/traer")
    public List <Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping ("/experiencia/crear")
    public String crearExperiencia(@RequestBody Experiencia experiencia){
    iexperienciaService.saveExperiencia(experiencia);
    return "La Experiencia fue creada correctamente";    
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String borrarExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La Experiencia fue eliminada correctamente";
    }

    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editarExperiencia (@PathVariable Long id, 
                                  @RequestParam ("empresa") String newEmpresa,
                                  @RequestParam ("rol") String newRol,
                                  @RequestParam ("fechadeingreso") String newFechadeingreso,
                                  @RequestParam ("fechadeegreso") String newFechadeegreso,
                                  @RequestParam ("tarea1") String newTarea1,
                                  @RequestParam ("tarea2") String newTarea2,
                                  @RequestParam ("tarea3") String newTarea3,
                                  @RequestParam ("tarea4") String newTarea4,
                                  @RequestParam ("tarea5") String newTarea5,
                                  @RequestParam ("tarea6") String newTarea6,
                                  @RequestParam ("tarea7") String newTarea7,
                                  @RequestParam ("tarea8") String newTarea8,
                                  @RequestParam ("tarea9") String newTarea9){
    Experiencia experiencia = iexperienciaService.findExperiencia(id);
    
    experiencia.setEmpresa (newEmpresa);
    experiencia.setRol(newRol);
    experiencia.setFechadeingreso (newFechadeingreso);
    experiencia.setFechadeegreso (newFechadeegreso);
    experiencia.setTarea1(newTarea1);
    experiencia.setTarea2(newTarea2);
    experiencia.setTarea3(newTarea3);
    experiencia.setTarea4(newTarea4);
    experiencia.setTarea5(newTarea5);
    experiencia.setTarea6(newTarea6);
    experiencia.setTarea7(newTarea7);
    experiencia.setTarea8(newTarea8);
    experiencia.setTarea9(newTarea9);
    
    
    iexperienciaService.saveExperiencia(experiencia);
    return experiencia;
}
    
}
