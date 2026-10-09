package Animales;

import interfaces.Mensajero;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajero {

    private String cuil;
    private double sueldo;

    private LocalTime horarioEntrada;
    private LocalTime horarioSalida;

    public Trabajador(String nombre, String apellido, LocalDate fechaN, String dir,
                      String cuil, double sueldo, LocalTime horarioEntrada, LocalTime horarioSalida) {
        super(nombre, apellido, fechaN, dir);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }

    public String getCuil() { return cuil; }
    public void setCuil(String cuil) { this.cuil = cuil; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public LocalTime getHorarioEntrada() { return horarioEntrada; }
    public void setHorarioEntrada(LocalTime horarioEntrada) { this.horarioEntrada = horarioEntrada; }

    public LocalTime getHorarioSalida() { return horarioSalida; }
    public void setHorarioSalida(LocalTime horarioSalida) { this.horarioSalida = horarioSalida; }

    @Override
    public void mensaje() {

        LocalTime horaActual = LocalTime.now();

        if (horaActual.isAfter(horarioEntrada) && horaActual.isBefore(horarioSalida)) {
            System.out.println("Yo " + getNombre() + " te invito a que ");
            System.out.println("vote por el partido por un mejor futuro");
        }
    }
}
