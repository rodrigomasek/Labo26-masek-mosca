package administracion.club_futbol;

import java.time.LocalDate;
import java.util.HashSet;

public class Entrenador extends CuerpoTecnico{
    private int cantCampeonatosObtenidos;
    private boolean licenciaVigente;

    public Entrenador(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String tituloProfesional, int añosXP, int cantCampeonatosObtenidos, boolean licenciaVigente) {
        super(nombre, fechaNacimiento, clubesTrabajados, tituloProfesional, añosXP);
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

    @Override
    public boolean fuiContratado(String nombre){
        return super.fuiContratado(nombre) && licenciaVigente && super.getAñosXP() > 3;
    }

    @Override
    public boolean puedeRenovar(){
        return licenciaVigente;
    }
}
