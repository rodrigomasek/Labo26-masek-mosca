package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Jugador {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String posicion;
    private String provinciaOrigen;
    private HashSet<String> historialClubes;
    private int numCamiseta;

    public Jugador(String nombre, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<String> historialClubes, int numCamiseta) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
        this.historialClubes = historialClubes;
        this.numCamiseta = numCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public HashSet<String> getHistorialClubes() {
        return historialClubes;
    }

    public void setHistorialClubes(HashSet<String> historialClubes) {
        this.historialClubes = historialClubes;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }
}
