package Objetos.Sensores;

import java.time.LocalDate;

public class SensorHumo extends Sensor{


    public SensorHumo(LocalDate fechaAdquirido, double umbral, double medida, boolean estado) {
        super(fechaAdquirido, umbral, medida, estado);
    }
    @Override
    public void activarAlarma() {
        System.out.println("Alarma de humo activada. Llamando a los bomberos.");
    }

    public static void main(String[] args) {

    }
}
