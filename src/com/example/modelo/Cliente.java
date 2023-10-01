package com.example.modelo;

public class Cliente {
    private String nombre;
    private String direccion;
    private String movil;

    public Cliente(String nombre, String direccion, String movil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }
}
