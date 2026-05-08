package Animales;

import java.time.LocalDate;

public class Profesor extends Persona {
    private double porcentajeDesc;


    public Profesor(double porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public Profesor(String nombre, String apellido, LocalDate fechaN, String dir, double porcentajeDesc) {
        super(nombre, apellido, fechaN, dir);
        this.porcentajeDesc = porcentajeDesc;
    }

    public Profesor(String nombre, String apellido, LocalDate fechaN, double porcentajeDesc) {
        super(nombre, apellido, fechaN);
        this.porcentajeDesc = porcentajeDesc;
    }

    public double getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(double porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public Profesor(String nombre, String apellido, double pd)
    {
        super(nombre,apellido);
        this.porcentajeDesc = pd;
    }
}

