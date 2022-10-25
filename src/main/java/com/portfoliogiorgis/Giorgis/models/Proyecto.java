package com.portfoliogiorgis.Giorgis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String tituloProy;
    private String descProy;
    private String linkProy;
    private String imagenProy;

    public Proyecto() {

    }

    public Proyecto(Long idProy, String tituloProy, String descProy, String linkProy, String imagenProy) {
        this.idProy = idProy;
        this.tituloProy = tituloProy;
        this.descProy = descProy;
        this.linkProy = linkProy;
        this.imagenProy = imagenProy;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public String getDescProy() {
        return descProy;
    }

    public void setDescProy(String descProy) {
        this.descProy = descProy;
    }

    public String getLinkProy() {
        return linkProy;
    }

    public void setLinkProy(String linkProy) {
        this.linkProy = linkProy;
    }

    public String getImagenProy() {
        return imagenProy;
    }

    public void setImagenProy(String imagenProy) {
        this.imagenProy = imagenProy;
    }
}
