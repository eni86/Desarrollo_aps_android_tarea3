package com.jenifer.desarrollo_aps_android_tarea3;

public class Mascota {
    private String nombre;
    private int like;
    private boolean liked = false;

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    private int foto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Mascota (int foto, String nombre, int like, boolean liked){
        this.foto           = foto;
        this.nombre         = nombre;
        this.like           = like;
        this.liked          = liked;

    }
}
