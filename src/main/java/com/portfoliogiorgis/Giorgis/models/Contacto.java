package com.portfoliogiorgis.Giorgis.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCon;
    private String mail;
    private Integer tel;
    private String github;
    private String linkedin;

    public Contacto() {
    }

    public Contacto(Long idCon, String mail, Integer tel, String github, String linkedin) {
        this.idCon = idCon;
        this.mail = mail;
        this.tel = tel;
        this.github = github;
        this.linkedin = linkedin;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
}
