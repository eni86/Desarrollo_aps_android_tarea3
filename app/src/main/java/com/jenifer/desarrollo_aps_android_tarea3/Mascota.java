package com.jenifer.desarrollo_aps_android_tarea3;

public class Mascota {
    private String nombre;
    private String descripcion;
    private int foto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Mascota (int foto, String nombre, String descripcion){
        this.foto           = foto;
        this.descripcion    = descripcion;
        this.nombre         = nombre;
    }
}
