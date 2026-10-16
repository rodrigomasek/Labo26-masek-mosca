package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class CuerpoTecnico extends PersonaFutbol{
    private String tituloProfesional;
    private int añosXP;

    public CuerpoTecnico(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String tituloProfesional, int añosXP) {
        super(nombre, fechaNacimiento, clubesTrabajados);
        this.tituloProfesional = tituloProfesional;
        this.añosXP = añosXP;
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
}
