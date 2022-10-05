package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.Mod.PersonaM;
import com.ar.maribelaizpitarte.backend.entity.Persona;
import com.ar.maribelaizpitarte.backend.interfaz.IPersonaService;
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
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    @GetMapping("/persona")
    public List<Persona> getPersona() {
        return personaService.getPersona();
    }

    @GetMapping("/persona/{id}")
    public Persona show(@PathVariable Long id) {
        return personaService.findById(id);
    }

    @PostMapping("/persona")
    @ResponseStatus (HttpStatus.CREATED)
    public String crearPersona(@RequestBody Persona persona
    ) {
        personaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String borrarPersona(@PathVariable Long id
    ) {
        personaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/persona/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Persona update(@RequestBody PersonaM personam,
            @PathVariable Long id){
        
        
        Persona personaActual = personaService.findById(id);
	personaActual.setApellido(personam.getApellido());
	personaActual.setNombre(personam.getNombre());

	personaService.savePersona(personaActual);
        return new Persona();
        }
   
}
