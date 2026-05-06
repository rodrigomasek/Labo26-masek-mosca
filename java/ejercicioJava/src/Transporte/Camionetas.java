package Transporte;

import java.time.LocalDate;

public class Camionetas extends Vehiculos{
    private int cantActual;
    private int cantMax;

    public Camionetas(String marca, String modelo, String color, int cantRuedas, LocalDate fFabricacion, double velocidad, String patente, int cantActual, int cantMax) {
        super(marca, modelo, color, cantRuedas, fFabricacion, velocidad, patente);

        this.cantActual = cantActual;
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public void agregarCarga(int carga){
        if((carga + this.cantActual) <= this.cantMax){
            this.cantActual += carga;
        }
        else {
            this.cantActual = this.cantMax;
        }
    }
}
