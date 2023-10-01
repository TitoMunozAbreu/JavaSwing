package com.example.modelo;

public class Menu {
    String Descripcion;
    String dia;

    public Menu(String dia, String descripcion) {
        Descripcion = descripcion;
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

}
