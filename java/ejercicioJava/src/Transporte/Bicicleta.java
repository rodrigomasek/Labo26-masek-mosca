package Transporte;

import java.time.LocalDate;

public class Bicicleta extends Vehiculos{
    public Bicicleta(String marca, String modelo, Color color, int cantRuedas, LocalDate fFabricacion, double velocidad) {
        super(marca, modelo, color, cantRuedas, fFabricacion, velocidad);
    }
}
