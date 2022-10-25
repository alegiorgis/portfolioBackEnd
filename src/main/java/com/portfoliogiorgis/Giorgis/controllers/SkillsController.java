package com.portfoliogiorgis.Giorgis.controllers;

import com.portfoliogiorgis.Giorgis.models.Skills;
import com.portfoliogiorgis.Giorgis.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    @PutMapping
    public ResponseEntity<Skills>editarSkills(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skillses=skillsService.buscarSkills();
        return new ResponseEntity<>(skillses, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills=skillsService.addSkills(skills);
        return new ResponseEntity<>(nuevaSkills, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id")Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
