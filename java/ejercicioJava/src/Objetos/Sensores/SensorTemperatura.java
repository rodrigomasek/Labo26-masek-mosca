package Objetos.Sensores;

import java.time.LocalDate;

public class SensorTemperatura extends Sensor {
    public SensorTemperatura(LocalDate fechaAdquirido, double umbral, double medida, boolean estado) {
        super(fechaAdquirido, umbral, medida, estado);
    }
    @Override
    public int activarAlarma() {
        System.out.println("Cuidado!! La temperatura sube!!!");
        return 1;
    }

    public static void main(String[] args) {

    }
}
