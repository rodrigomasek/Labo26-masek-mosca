package Animales;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaN;
    private String dir;

    public Persona() {
        this.nombre = "nombre-default";
        this.apellido = "apellido-default";
        this.fechaN = LocalDate.of(6767,6,7);
        this.dir = "dir-default";

    }

    public Persona(String nombre, String apellido, LocalDate fechaN, String dir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.dir = dir;
    }
    public Persona(String nombre, String apellido, LocalDate fechaN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;

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

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public int obtenerEdad()
    {
        return Period.between(this.fechaN, LocalDate.now()).getYears();
    }

    public void imprimir()
    {
        System.out.println("El nombre es " + nombre);
        System.out.println("La direccion es " + dir);
        System.out.println("La edad es " + obtenerEdad());
    }

    public static void main(String[] args)
    {

    }
}
