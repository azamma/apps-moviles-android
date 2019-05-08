package com.example.appsmoviles.clases;

public class Comida {

    private String nombre;
    private int calorias;
    private int proteinas;
    private int hidratos;
    private int grasas;
    private int imagen;

    public Comida(String nombre, int calorias, int proteinas, int hidratos, int grasas, int imagen) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.hidratos = hidratos;
        this.grasas = grasas;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getHidratos() {
        return hidratos;
    }

    public void setHidratos(int hidratos) {
        this.hidratos = hidratos;
    }

    public int getGrasas() {
        return grasas;
    }

    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
