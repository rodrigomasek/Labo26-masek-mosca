package Restaurante;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Platillo> platillos;

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public Menu(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }
    // eliminar platos
    public void agrega(Platillo p)
    {
        this.platillos.add(p);
    }
    public void modificar(int posicion, Platillo p)
    {
        this.platillos.set(posicion, p);
    }
    public void modificar(int posicion)
    {
        this.platillos.remove(posicion);
    }
    public static void main(String[] args) {

    }
}

