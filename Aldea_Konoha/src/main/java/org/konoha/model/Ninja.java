package org.konoha.model.DAO;

public class Ninja {
    private int id;
    private String nombre;
    private String rango;
    private String aldea;
    public Ninja(int id, String nombre, String rango, String aldea) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getAldea() {return aldea;}
    public String getRango() {return rango;}

    public  void setId(int id) {this.id = id;}
    public void setRango(String rango) {this.rango = rango;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setAldea(String aldea) {this.aldea = aldea;}

    @Override
    public String toString() {
        return id + "-" + nombre + " - " + rango + " - " + aldea;
    }
}
