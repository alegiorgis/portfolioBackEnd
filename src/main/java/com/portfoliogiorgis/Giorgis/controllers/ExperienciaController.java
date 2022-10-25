package com.portfoliogiorgis.Giorgis.controllers;

import com.portfoliogiorgis.Giorgis.models.Experiencia;
import com.portfoliogiorgis.Giorgis.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    @PutMapping
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id")Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
