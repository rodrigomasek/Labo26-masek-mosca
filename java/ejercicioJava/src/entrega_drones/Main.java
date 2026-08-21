package entrega_drones;

import enums.Estado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mision misionCarga = new Mision(
                -58.45,
                -34.58,
                false
        );

        Mision misionVigilancia = new Mision(
                -58.40,
                -34.60,
                false
        );

        Dron d1 = new DronCarga(
                "DJI Phantom 4",
                LocalDate.of(2025, 3, 15),
                5200.0,
                1,
                Estado.EN_VUELO,
                misionCarga,
                2.5
        );

        Dron d2 = new DronVigilancia(
                "DJI Phantom 4",
                LocalDate.of(2025, 3, 15),
                5200.0,
                2,
                Estado.EN_VUELO,
                misionVigilancia,
                200
        );


        ArrayList<Dron> drones = new ArrayList<>();

        drones.add(d1);
        drones.add(d2);


        Sistema sistema = new Sistema(drones);


        System.out.println("Cantidad de drones: " + sistema.getDrones().size());


        boolean resultadoCarga = d1.hacerMision();
        boolean resultadoVigilancia = d2.hacerMision();


        System.out.println("--- DRON DE CARGA ---");
        System.out.println("Misión exitosa: " + resultadoCarga);
        System.out.println("Batería restante: " + d1.getBateria());
        System.out.println("--- DRON DE VIGILANCIA ---");
        System.out.println("Misión exitosa: " + resultadoVigilancia);
        System.out.println("Memoria restante: " + ((DronVigilancia) d2).getMemoriaDisponible());
    }

}
