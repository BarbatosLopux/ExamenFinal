package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="genero")
public class Gender {

    @Id
    @Column(name= "idGenero")
    private int idGender;


    @Column(name = "nombreGenero", length = 75)
    private String nameGender;

// Relacion Uno a muchos
    @OneToMany(mappedBy = "gender", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Content> content;



    public Gender() {
    }

    public Gender(int idGender, String nameGender, List<Content> content) {
        this.idGender = idGender;
        this.nameGender = nameGender;
        this.content = content;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
