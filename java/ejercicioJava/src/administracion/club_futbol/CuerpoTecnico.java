package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public class CuerpoTecnico {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String tituloProfesional;
    private int añosXP;
    private HashSet<String> clubesTrabajados;

    public CuerpoTecnico(String nombre, LocalDate fechaNacimiento, String tituloProfesional, int añosXP, HashSet<String> clubesTrabajados) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tituloProfesional = tituloProfesional;
        this.añosXP = añosXP;
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

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public int getAñosXP() {
        return añosXP;
    }

    public void setAñosXP(int añosXP) {
        this.añosXP = añosXP;
    }

    public HashSet<String> getClubesTrabajados() {
        return clubesTrabajados;
    }

    public void setClubesTrabajados(HashSet<String> clubesTrabajados) {
        this.clubesTrabajados = clubesTrabajados;
    }
}
