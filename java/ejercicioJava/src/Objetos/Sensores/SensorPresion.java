package Objetos.Sensores;

import java.time.LocalDate;

public class SensorPresion extends Sensor{
    public SensorPresion(LocalDate fechaAdquirido, double umbral, double medida, boolean estado) {
        super(fechaAdquirido, umbral, medida, estado);
    }
    @Override
    public int activarAlarma() {
        System.out.println("Sensor de presion activado");
        return 1;
    }

    public static void main(String[] args) {

    }
}
