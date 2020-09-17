package com.tcs.proyectoadvantageonlineshopping.models;

public class Productos {
    private String categoria;
    private String nombre;
    private String cantidad;

    public Productos(String categoria, String nombre, String cantidad){
        this.categoria = categoria;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }
}
