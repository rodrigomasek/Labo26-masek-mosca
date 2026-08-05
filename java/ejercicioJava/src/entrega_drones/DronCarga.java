package entrega_drones;

import enums.Estado;

import java.time.LocalDate;

public class DronCarga extends Dron{
    private double carga;

    public DronCarga(String nombreModelo, LocalDate fAdquirido, double bateria, int id, Estado estado, Mision mision, double carga) {
        super(nombreModelo, fAdquirido, bateria, id, estado, mision);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public boolean hacerMision() {
        if (this.getBateria() >= 48 && this.getMision().obtenerKm() < 30)
        {
            setBateria(this.getBateria() - 48);
            return true;
        }
        return false;
    }
}
