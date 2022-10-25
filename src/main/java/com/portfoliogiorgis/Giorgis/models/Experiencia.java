package com.portfoliogiorgis.Giorgis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private Integer fechainExp;
    private Integer fechafinExp;
    private String descExp;
    private String imgenExp;

    public Experiencia() {

    }

    public Experiencia(Long idExp, String tituloExp, Integer fechainExp, Integer fechafinExp, String descExp, String imgenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechainExp = fechainExp;
        this.fechafinExp = fechafinExp;
        this.descExp = descExp;
        this.imgenExp = imgenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public Integer getFechainExp() {
        return fechainExp;
    }

    public void setFechainExp(Integer fechainExp) {
        this.fechainExp = fechainExp;
    }

    public Integer getFechafinExp() {
        return fechafinExp;
    }

    public void setFechafinExp(Integer fechafinExp) {
        this.fechafinExp = fechafinExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImgenExp() {
        return imgenExp;
    }

    public void setImgenExp(String imgenExp) {
        this.imgenExp = imgenExp;
    }
}

