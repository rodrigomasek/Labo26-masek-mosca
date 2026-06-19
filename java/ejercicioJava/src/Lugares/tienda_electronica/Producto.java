package Lugares.tienda_electronica;

import enums.Categoria_Electronica;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private Categoria_Electronica categoria;

    public Producto(Categoria_Electronica categoria, int stock, double precio, String nombre) {
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria_Electronica getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_Electronica categoria) {
        this.categoria = categoria;
    }


}
