package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class JugadorCampo extends Jugador{
    private int porcentajeGolesHechos;
    private int cantAsistencias;

    public JugadorCampo(String nombre, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<String> historialClubes, int numCamiseta, int porcentajeGolesHechos, int cantAsistencias) {
        super(nombre, fechaNacimiento, posicion, provinciaOrigen, historialClubes, numCamiseta);
        this.porcentajeGolesHechos = porcentajeGolesHechos;
        this.cantAsistencias = cantAsistencias;
    }

    public int getPorcentajeGolesHechos() {
        return porcentajeGolesHechos;
    }

    public void setPorcentajeGolesHechos(int porcentajeGolesHechos) {
        this.porcentajeGolesHechos = porcentajeGolesHechos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
}
