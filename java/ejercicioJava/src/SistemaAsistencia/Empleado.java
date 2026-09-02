package SistemaAsistencia;

import enums.DiasSemana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {
    private HashSet<DiasSemana> jornadaSemanal;
    private HashSet <LocalDateTime> asistencia;
    public Empleado(String nombre, String apellido, String telefono, LocalDate fNacimiento) {
        super(nombre, apellido, telefono, fNacimiento);
    }

    public Empleado(String nombre, String apellido, String telefono, LocalDate fNacimiento, HashSet<DiasSemana> jornadaSemanal, HashSet<LocalDateTime> asistencia) {
        super(nombre, apellido, telefono, fNacimiento);
        this.jornadaSemanal = jornadaSemanal;
        this.asistencia = asistencia;
    }

    public HashSet<DiasSemana> getJornadaSemanal() {
        return jornadaSemanal;
    }

    public void setJornadaSemanal(HashSet<DiasSemana> jornadaSemanal) {
        this.jornadaSemanal = jornadaSemanal;
    }

    public HashSet<LocalDateTime> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashSet<LocalDateTime> asistencia) {
        this.asistencia = asistencia;
    }

    public void ingresar()
    {
        asistencia.add(LocalDateTime.now());
    }



}
