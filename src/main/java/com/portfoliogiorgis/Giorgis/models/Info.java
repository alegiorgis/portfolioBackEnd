package com.portfoliogiorgis.Giorgis.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Info implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String about;
    private String fotoperfil;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProy")
    private List<Proyecto> proyectoList;

    public Info() {
    }

    public Info(Long id, String nombre, String apellido, String titulo, String about, String fotoperfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.about = about;
        this.fotoperfil = fotoperfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }
}
