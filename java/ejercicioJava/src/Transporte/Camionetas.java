package Transporte;

import java.time.LocalDate;

public class Camionetas extends Vehiculos{
    private String patente;
    private int kg;

    public Camionetas(String marca, String modelo, String color, int cantRuedas, LocalDate fFabricacion, double velocidad, String patente, int kg) {
        super(marca, modelo, color, cantRuedas, fFabricacion, velocidad);

        this.patente = patente;
        this.kg = kg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
