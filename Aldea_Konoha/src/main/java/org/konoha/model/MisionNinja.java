package org.konoha.model;


public class MisionNinja {
    private int idMisionNinja;
    private int idNinja;
    private int IdMision;
    private String fechaInicio;
    private String fechaFin;

    public MisionNinja(int idMisionNinja, int idNinja, int IdMision, String fechaInicio, String fechaFin) {
        this.idMisionNinja = idMisionNinja;
        this.idNinja = idNinja;
        this.IdMision = IdMision;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public MisionNinja() {}

    public int getIdMisionNinja() {return idMisionNinja;}
    public int getIdNinja() {return idNinja;}
    public int getIdMision() {return IdMision;}
    public String getFechaInicio() {return fechaInicio;}
    public String getFechaFin() {return fechaFin;}

    public void setIdMisionNinja(int idMisionNinja) {this.idMisionNinja = idMisionNinja;}
    public void setIdNinja(int idNinja) {this.idNinja = idNinja;}
    public void setIdMision(int IDMision) {this.IdMision = IDMision;}
    public void setFechaInicio(String fechaInicio) {this.fechaInicio = fechaInicio;}
    public void setFechaFin(String fechaFin) {this.fechaFin = fechaFin;}

}
