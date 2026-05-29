package deporte.curling;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;
    private int numCamisa;
    private ArrayList<Disponibilidad> disponibilidad;
    private boolean capitan;

    public enum Disponibilidad{MAÑANA, TARDE, NOCHE}

    public Jugador(String nombre, String apellido, LocalDate fNacimiento, int numCamisa, ArrayList<Disponibilidad> disponibilidad, boolean capitan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.numCamisa = numCamisa;
        this.disponibilidad = disponibilidad;
        this.capitan = capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public ArrayList<Disponibilidad> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(ArrayList<Disponibilidad> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
