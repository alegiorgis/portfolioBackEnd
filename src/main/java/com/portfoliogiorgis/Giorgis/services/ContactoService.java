package com.portfoliomatsuda.Matsuda.services;

import com.portfoliomatsuda.Matsuda.models.Contacto;
import com.portfoliomatsuda.Matsuda.repository.ContactoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ContactoService {
    private final ContactoRepo contactoRepo;

    @Autowired
    public ContactoService(ContactoRepo contactoRepo) {
        this.contactoRepo = contactoRepo;
    }
    public Contacto addContacto(Contacto contacto) {
        return contactoRepo.save(contacto);
    }
    public List<Contacto> buscarContacto(){
        return contactoRepo.findAll();
    }
    public Contacto editarContacto(Contacto contacto){
        return contactoRepo.save(contacto);
    }
    public void borrarContacto(Long id){
        contactoRepo.deleteById(id);
    }
}
