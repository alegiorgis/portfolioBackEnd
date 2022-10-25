package com.portfoliogiorgis.Giorgis.controllers;

import com.portfoliogiorgis.Giorgis.models.Contacto;
import com.portfoliogiorgis.Giorgis.services.ContactoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService) {
        this.contactoService=contactoService;
    }
    @PutMapping
    public ResponseEntity<Contacto> editarContacto (@RequestBody Contacto contacto){
        Contacto updateContacto=contactoService.editarContacto(contacto);
        return new ResponseEntity<>(updateContacto, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Contacto>> obtenerContacto(){
        List<Contacto> contactos=contactoService.buscarContacto();
        return new ResponseEntity<>(contactos, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Contacto> crearContacto(@RequestBody Contacto contacto){
        Contacto nuevoContacto=contactoService.addContacto(contacto);
        return new ResponseEntity<>(nuevoContacto, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarContacto (@PathVariable("id") Long id){
    contactoService.borrarContacto(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
