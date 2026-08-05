package entrega_drones;

import enums.Estado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dron> drones;

    public Sistema(ArrayList<Dron> drones) {
        this.drones = drones;
    }

    public ArrayList<Dron> getDrones() {
        return drones;
    }

    public void setDrones(ArrayList<Dron> drones) {
        this.drones = drones;
    }

    public static void main(String[] args) {
        Dron d1 = new DronCarga("DJI Phantom 4", LocalDate.of(2025, 3, 15), 5200.0, 1, Estado.EN_VUELO, new Mision(), 2.5);
        Dron d2 = new DronVigilancia("DJI Phantom 4", LocalDate.of(2025, 3, 15), 5200.0, 1, Estado.EN_VUELO, new Mision(), 200);
    }
}
