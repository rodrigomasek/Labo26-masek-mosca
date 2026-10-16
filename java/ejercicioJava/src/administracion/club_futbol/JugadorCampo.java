package administracion.club_futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class JugadorCampo extends Jugador{
    private int porcentajeGolesHechos;
    private int cantAsistencias;

    public JugadorCampo(String nombre, LocalDate fechaNacimiento, HashSet<String> clubesTrabajados, String posicion, String provinciaOrigen, int porcentajeGolesHechos, int cantAsistencias) {
        super(nombre, fechaNacimiento, clubesTrabajados, posicion, provinciaOrigen);
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

    @Override
    public boolean fuiContratado(String nombre){
        return super.fuiContratado(nombre) && cantAsistencias > 10 && porcentajeGolesHechos > 30;
    }
}
