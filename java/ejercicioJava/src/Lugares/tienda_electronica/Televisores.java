package Lugares.tienda_electronica;

import enums.Categoria_Electronica;
import enums.Tecnoligia;

public class Televisores extends Producto {
    private Tecnoligia tecnoligia;

    public Televisores(int stock, double precio, String nombre) {
        super(Categoria_Electronica.MULTIMEDIA, stock, precio, nombre);
    }


    public Tecnoligia getTecnoligia() {
        return tecnoligia;
    }

    public void setTecnoligia(Tecnoligia tecnoligia) {
        this.tecnoligia = tecnoligia;
    }
}
