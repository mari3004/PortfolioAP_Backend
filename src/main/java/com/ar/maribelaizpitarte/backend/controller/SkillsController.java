package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Skills;
import com.ar.maribelaizpitarte.backend.interfaz.ISkillsService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins= {"https://apfrontend-2d469.web.app"})
@RequestMapping("/api")
public class SkillsController {
    
    @Autowired ISkillsService iskillsService;
    
    @GetMapping ("/skills")
    public List <Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    @PostMapping ("/skills")
    @ResponseStatus (HttpStatus.CREATED)
    public String crearSkills(@RequestBody Skills skills){
    iskillsService.saveSkills(skills);
    return "La Skill fue creada correctamente";    
    }
    
    @DeleteMapping ("/skills/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String borrarSkills(@PathVariable Long id){
        iskillsService.deleteSkills(id);
        return "La Skill fue eliminada correctamente";
    }

    @PutMapping ("/skills/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Skills editarSkills (@PathVariable Long id, 
                                  @RequestParam ("skill") String newSkill,
                                  @RequestParam ("porcentaje") Integer newPorcentaje){
        
    Skills skills = iskillsService.findSkills(id);
    
    skills.setSkill (newSkill);
    skills.setPorcentaje (newPorcentaje);
    
    
    iskillsService.saveSkills(skills);
    return skills;
}
    
}


