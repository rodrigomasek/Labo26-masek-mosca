package Lugares.tienda_electronica;

import enums.Categoria_Electronica;

public class Cargadores_Portatiles extends Producto {
    private int cantSinCargar;

    public Cargadores_Portatiles(int stock, double precio, String nombre) {
        super(Categoria_Electronica.CARGADORES, stock, precio, nombre);
    }


    public int getCantSinCargar() {
        return cantSinCargar;
    }

    public void setCantSinCargar(int cantSinCargar) {
        this.cantSinCargar = cantSinCargar;
    }

}
