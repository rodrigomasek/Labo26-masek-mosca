package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Jugador extends PersonaFutbol{
    private String posicion;
    private String provinciaOrigen;

    public Jugador(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String posicion, String provinciaOrigen) {
        super(nombre, fechaNacimiento, clubesTrabajados);
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

    @Override
    public boolean puedeRenovar(){
        return getFechaNacimiento().getYear() <= 35;
    }
}
