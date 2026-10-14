package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Arquero extends Jugador{
    private int porcentajeAtajado;
    private int golesRecibidosUltTemporada;


    public Arquero(String nombre, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<String> historialClubes, int numCamiseta, int porcentajeAtajado, int golesRecibidosUltTemporada) {
        super(nombre, fechaNacimiento, posicion, provinciaOrigen, historialClubes, numCamiseta);
        this.porcentajeAtajado = porcentajeAtajado;
        this.golesRecibidosUltTemporada = golesRecibidosUltTemporada;
    }

    public int getPorcentajeAtajado() {
        return porcentajeAtajado;
    }

    public void setPorcentajeAtajado(int porcentajeAtajado) {
        this.porcentajeAtajado = porcentajeAtajado;
    }

    public int getGolesRecibidosUltTemporada() {
        return golesRecibidosUltTemporada;
    }

    public void setGolesRecibidosUltTemporada(int golesRecibidosUltTemporada) {
        this.golesRecibidosUltTemporada = golesRecibidosUltTemporada;
    }
}
