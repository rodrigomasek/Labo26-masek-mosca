package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Arquero extends Jugador{
    private int porcentajeAtajado;
    private int golesRecibidosUltTemporada;

    public Arquero(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String posicion, String provinciaOrigen, int porcentajeAtajado, int golesRecibidosUltTemporada) {
        super(nombre, fechaNacimiento, clubesTrabajados, posicion, provinciaOrigen);
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

    @Override
    public boolean fuiContratado(String nombre){
        return super.fuiContratado(nombre) && porcentajeAtajado > 60 && golesRecibidosUltTemporada < 10;
    }
}
