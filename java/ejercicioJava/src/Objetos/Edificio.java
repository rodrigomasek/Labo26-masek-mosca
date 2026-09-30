package Objetos;

import java.util.Scanner;
import Objetos.Sensores.GrupoSensor;
import Objetos.Sensores.Sensor;
import java.util.ArrayList;

public class Edificio {
    private ArrayList<Sensor> sensores;
    private ArrayList<GrupoSensor> grupos;

    public Edificio(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
        this.grupos = new ArrayList<>();
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Sensor> sensores = new ArrayList<>();

        Edificio edificio = new Edificio(sensores);

        if (sensores.isEmpty()) {
            System.out.println("No hay dispositivos (alarmas/sensores) registrados en el edificio.");
            scanner.close();
            return;
        }

        int opcion = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese el número del dispositivo (0 a " + (sensores.size() - 1) + "): ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 0 && opcion < sensores.size()) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: El número ingresado está fuera de rango. Intente nuevamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar obligatoriamente un número entero válido.");
            }
        }

        System.out.println("Dispositivo elegido (Índice " + opcion + "): " + sensores.get(opcion));


        scanner.close();
    }
}