package com.portfoliogiorgis.Giorgis.services;

import com.portfoliogiorgis.Giorgis.models.Proyecto;
import com.portfoliogiorgis.Giorgis.repository.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }
    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public List<Proyecto> buscarProyecto(){
        return proyectoRepo.findAll();
    }
    public Proyecto editarProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public void borrarProyecto (Long id){
        proyectoRepo.deleteById(id);
    }
}
