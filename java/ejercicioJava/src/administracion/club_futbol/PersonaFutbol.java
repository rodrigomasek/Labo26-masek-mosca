package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class PersonaFutbol{
    private String nombre;
    private LocalDate fechaNacimiento;
    private HashSet<String> clubesTrabajados;

    public PersonaFutbol(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.clubesTrabajados = clubesTrabajados;
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

    public HashSet<String> getClubesTrabajados() {
        return clubesTrabajados;
    }

    public void setClubesTrabajados(HashSet<String> clubesTrabajados) {
        this.clubesTrabajados = clubesTrabajados;
    }

    public boolean fuiContratado(String nombre){
        return clubesTrabajados.contains(nombre);
    }

    public abstract boolean puedeRenovar();
}
