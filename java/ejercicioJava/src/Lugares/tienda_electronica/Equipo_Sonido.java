package Lugares.tienda_electronica;

import enums.Categoria_Electronica;

public class Equipo_Sonido extends Producto {
    private boolean bluetooth;

    public Equipo_Sonido(int stock, double precio, String nombre, boolean bluetooth) {
        super(Categoria_Electronica.MULTIMEDIA, stock, precio, nombre);
        this.bluetooth = bluetooth;
    }
}
