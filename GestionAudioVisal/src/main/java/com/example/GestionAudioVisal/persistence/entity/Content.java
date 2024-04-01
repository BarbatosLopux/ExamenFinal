package com.example.GestionAudioVisal.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "contenido")
public class Content {

    @Id
    @Column (name = "idContenido" )
    private int idContent;

    // Relacion Muchos a uno
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGenero")
    private Gender gender;

    // Relacion muchos a muchos
    @ManyToMany(mappedBy = "contents")
    private List<User>users;



    @Column(name = "nombre", nullable = false)
    private String nameContent;

    @Column(name = "tipoContenido")
    private String contentType;


    @Column(name = "estadoVisualizacion", length = 50)
    private String displayStatus;

    @Column(name = "plataforma", length = 50)
    private String plataform;

    @Column(name = "calificacion")
    private int calification;


    @Column(name = "comentario", length = 255)
    private String comment;


    public Content() {
    }

    public Content(int idContent, Gender gender, List<User> users, String nameContent, String contentType, String displayStatus, String plataform, int calification, String comment) {
        this.idContent = idContent;
        this.gender = gender;
        this.users = users;
        this.nameContent = nameContent;
        this.contentType = contentType;
        this.displayStatus = displayStatus;
        this.plataform = plataform;
        this.calification = calification;
        this.comment = comment;
    }

    public int getIdContent() {
        return idContent;
    }

    public void setIdContent(int idContent) {
        this.idContent = idContent;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getNameContent() {
        return nameContent;
    }

    public void setNameContent(String nameContent) {
        this.nameContent = nameContent;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
