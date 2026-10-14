package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public class Entrenador extends CuerpoTecnico{
    private int cantCampeonatosObtenidos;
    private boolean licenciaVigente;

    public Entrenador(String nombre, LocalDate fechaNacimiento, String tituloProfesional, int añosXP, HashSet<String> clubesTrabajados, int cantCampeonatosObtenidos, boolean licenciaVigente) {
        super(nombre, fechaNacimiento, tituloProfesional, añosXP, clubesTrabajados);
        this.cantCampeonatosObtenidos = cantCampeonatosObtenidos;
        this.licenciaVigente = licenciaVigente;
    }

    public int getCantCampeonatosObtenidos() {
        return cantCampeonatosObtenidos;
    }

    public void setCantCampeonatosObtenidos(int cantCampeonatosObtenidos) {
        this.cantCampeonatosObtenidos = cantCampeonatosObtenidos;
    }

    public boolean isLicenciaVigente() {
        return licenciaVigente;
    }

    public void setLicenciaVigente(boolean licenciaVigente) {
        this.licenciaVigente = licenciaVigente;
    }
}
