package administracion.endocrinologia;

import java.time.LocalDate;
import java.time.Period;

public abstract class Paciente{
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Genero genero;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int edad(){
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
