package org.konoha.model;

public class Mision {
    private int idMision;
    private String descripcion;
    private String rango;
    private String recompensa;

    public Mision(int idMision, String descripcion, String rango, String recompensa) {
        this.idMision = idMision;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
    }

    public int getIdMision() {return idMision;}
    public String getDescripcion() {return descripcion;}
    public String getRango() {return rango;}
    public String getRecompensa() {return recompensa;}

    public void setIdMision(int idMision) {this.idMision = idMision;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setRango(String rango) {this.rango = rango;}
    public void setRecompensa(String recompensa) {this.recompensa = recompensa;}

    @Override
    public String toString() {
        return idMision+"\t"+descripcion+"\t"+rango+"\t"+recompensa;
    }
}
