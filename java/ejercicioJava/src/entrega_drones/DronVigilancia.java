package entrega_drones;

import enums.Estado;

import java.time.LocalDate;

public class DronVigilancia extends Dron{
    private double memoriaDisponible;

    public DronVigilancia(String nombreModelo, LocalDate fAdquirido, double bateria, int id, Estado estado, Mision mision, double memoriaDisponible) {
        super(nombreModelo, fAdquirido, bateria, id, estado, mision);
        this.memoriaDisponible = memoriaDisponible;
    }

    public double getMemoriaDisponible() {
        return memoriaDisponible;
    }

    public void setMemoriaDisponible(double memoriaDisponible) {
        this.memoriaDisponible = memoriaDisponible;
    }

    public double memoriaNecesaria()
    {
        return (this.getMision().obtenerKm()/2) * 12;
    }
    public void tomarFoto()
    {
        this.setMemoriaDisponible(getMemoriaDisponible() - 12);
    }
    @Override
    public boolean hacerMision() {
        if (memoriaNecesaria() <= this.memoriaDisponible) {
            for (int i = 0; i < this.getMision().obtenerKm(); i += 2) {
                tomarFoto();
            }
            this.getMision().setExito(true);
            return true;
        }
        this.getMision().setExito(false);
        return false;
    }
}
