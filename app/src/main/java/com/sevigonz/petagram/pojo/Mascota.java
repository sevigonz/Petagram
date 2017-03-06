package com.sevigonz.petagram.pojo;

/**
 * Created by angel on 21/02/17.
 */

public class Mascota {

    private int  id;
    private String nombre;
    private int  imagen;
    private int raiting;
    private boolean liked;

    public Mascota(String nombre, int imagen, int raiting) {
        this.nombre = nombre;
        this.raiting = raiting;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
