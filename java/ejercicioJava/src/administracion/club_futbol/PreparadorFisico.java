package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public class PreparadorFisico extends CuerpoTecnico{
    private String especialidad;
    private boolean tieneMatricula;

    public PreparadorFisico(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String tituloProfesional, int añosXP, String especialidad, boolean tieneMatricula) {
        super(nombre, fechaNacimiento, clubesTrabajados, tituloProfesional, añosXP);
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

    @Override
    public boolean fuiContratado(String nombre){
        return super.fuiContratado(nombre) && tieneMatricula && super.getAñosXP() >= 2;
    }

    @Override
    public boolean puedeRenovar(){
        return tieneMatricula;
    }
}
