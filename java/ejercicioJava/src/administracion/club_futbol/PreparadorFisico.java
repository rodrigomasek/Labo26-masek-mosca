package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public class PreparadorFisico extends CuerpoTecnico{
    private String especialidad;
    private boolean tieneMatricula;

    public PreparadorFisico(String nombre, LocalDate fechaNacimiento, String tituloProfesional, int añosXP, HashSet<String> clubesTrabajados, String especialidad, boolean tieneMatricula) {
        super(nombre, fechaNacimiento, tituloProfesional, añosXP, clubesTrabajados);
        this.especialidad = especialidad;
        this.tieneMatricula = tieneMatricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isTieneMatricula() {
        return tieneMatricula;
    }

    public void setTieneMatricula(boolean tieneMatricula) {
        this.tieneMatricula = tieneMatricula;
    }
}
