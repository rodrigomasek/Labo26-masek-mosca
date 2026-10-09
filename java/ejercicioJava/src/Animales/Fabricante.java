package Animales;

import java.time.LocalDate;

public class Fabricante extends Persona{
    private String especialiadad;

    public Fabricante(String nombre, String apellido, LocalDate fechaN, String especialiadad) {
        super(nombre, apellido, fechaN);
        this.especialiadad = especialiadad;
    }

    public String getEspecialiadad() {
        return especialiadad;
    }

    public void setEspecialiadad(String especialiadad) {
        this.especialiadad = especialiadad;
    }
}
