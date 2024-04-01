package com.example.GestionAudioVisal.persistence.DTO;

public class GenderDTO {
    private int IdGender;
    private String nameGender;

    public GenderDTO(int idGender, String nameGender) {
        IdGender = idGender;
        this.nameGender = nameGender;
    }

    public GenderDTO() {
    }

    public int getIdGender() {
        return IdGender;
    }

    public void setIdGender(int idGender) {
        IdGender = idGender;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }

    @Override
    public String toString() {
        return "GenderDTO{" +
                "IdGender=" + IdGender +
                ", nameGender='" + nameGender + '\'' +
                '}';
    }
}
