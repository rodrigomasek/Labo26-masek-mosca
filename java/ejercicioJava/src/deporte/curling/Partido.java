package deporte.curling;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partido {

    private Equipos equipo1;
    private Equipos equipo2;
    private LocalDate fecha;
    private String turno;

    public Equipos getEquipo1() {
        return equipo1;
    }

    public Partido(Equipos equipo1, Equipos equipo2, LocalDate fecha, String turno) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.turno = turno;
    }

    public void setEquipo1(Equipos equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipos getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipos equipo2) {
        this.equipo2 = equipo2;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean validar(){
        return (this.equipo1 == this.equipo2);
    }


}
