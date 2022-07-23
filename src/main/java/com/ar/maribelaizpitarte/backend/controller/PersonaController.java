package com.ar.maribelaizpitarte.backend.controller;

import com.ar.maribelaizpitarte.backend.entity.Persona;
import com.ar.maribelaizpitarte.backend.interfaz.IPersonaService;
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
@CrossOrigin (origins = "https://frontend-portfolioap.web.app/")
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    @GetMapping("/persona/traer")
    public List<Persona> getPersona() {
        return personaService.getPersona();
    }

    @GetMapping("/persona/{id}")
    public Persona show(@PathVariable Long id) {
        return personaService.findById(id);
    }

    @PostMapping("/persona/crear")
    public String crearPersona(@RequestBody Persona persona
    ) {
        personaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String borrarPersona(@PathVariable Long id
    ) {
        personaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam("nombre") String newNombre,
            @RequestParam("apellido") String newApellido
    ) {
        Persona persona = personaService.findPersona(id);

        persona.setNombre(newNombre);
        persona.setApellido(newApellido);

        personaService.savePersona(persona);
        return persona;
    }

}
