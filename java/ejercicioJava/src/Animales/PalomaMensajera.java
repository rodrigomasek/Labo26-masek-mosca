package Animales;

import interfaces.Mensajero;

public class PalomaMensajera extends Paloma implements Mensajero {
    private boolean aprendioCamino;

    public PalomaMensajera(String color, String nombre, String especie, boolean aprendioCamino) {
        super(color, nombre, especie);
        this.aprendioCamino = aprendioCamino;
    }

    public boolean isAprendioCamino() {
        return aprendioCamino;
    }

    public void setAprendioCamino(boolean aprendioCamino) {
        this.aprendioCamino = aprendioCamino;
    }
    @Override
    public void mensaje()
    {
        if(aprendioCamino) {
            System.out.println("Lanzando un papelito que dice: ");
            System.out.println("Vote por el partido para un mejor futuro");
        }
    }
}
