package com.example.GestionAudioVisal.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @Column(name = "idUsuario")
    private int idUser;


    @Column(name = "nombre", length = 100)
    private String name;

    @Column(name = "correoElectronico")
    private String email;


    @Column(name = "contraseña", length = 155)
    private String password;


    private String token;


    // Relacion muchos a muchos

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name="contenidoGeneros", joinColumns = @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario"),
            inverseJoinColumns = @JoinColumn(name = "idContenido", referencedColumnName = "idContenido")
    )
    private List<Content>contents;




    public User() {
    }

    public User(int idUser, String name, String email, String password, String token, List<Content> contents) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.token = token;
        this.contents = contents;
    }

    public User(String name, String password, String token) {
        this.name = name;
        this.password = password;
        this.token = token;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
}
