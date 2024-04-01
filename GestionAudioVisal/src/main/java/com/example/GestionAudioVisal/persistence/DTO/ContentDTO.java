package com.example.GestionAudioVisal.persistence.DTO;

public class ContentDTO {

    private int idContent;
    private String nameContent;
    private String contentType;
    private String displayStatus;
    private String plataform;
    private int calification;
    private String comment;

    public ContentDTO(int idContent, String nameContent, String contentType, String displayStatus, String plataform, int calification, String comment) {
        this.idContent = idContent;
        this.nameContent = nameContent;
        this.contentType = contentType;
        this.displayStatus = displayStatus;
        this.plataform = plataform;
        this.calification = calification;
        this.comment = comment;
    }

    public ContentDTO() {
    }

    public int getIdContent() {
        return idContent;
    }

    public void setIdContent(int idContent) {
        this.idContent = idContent;
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

    @Override
    public String toString() {
        return "ContentDTO{" +
                "idContent=" + idContent +
                ", nameContent='" + nameContent + '\'' +
                ", contentType='" + contentType + '\'' +
                ", displayStatus='" + displayStatus + '\'' +
                ", plataform='" + plataform + '\'' +
                ", calification=" + calification +
                ", comment='" + comment + '\'' +
                '}';
    }
}
