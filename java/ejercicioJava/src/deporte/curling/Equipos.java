package deporte.curling;

import java.util.ArrayList;

public class Equipos {
    private ArrayList<Jugador> jugadores;

    public Equipos(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean numeroCamisaDisponible(Jugador j) {
        for (Jugador juga : jugadores) {
            if (juga.getNumCamisa() == j.getNumCamisa()) {
                return false;
            }
        }
        return true;
    }

    public int contarCapitanes() {
        int contador = 0;

        for (Jugador j : jugadores) {
            if (j.isCapitan()) {
                contador++;
            }
        }

        return contador;
    }

    public void llenar(Jugador j) {

        if (jugadores.size() >= 11) return;

        if (!numeroCamisaDisponible(j)) return;

        if (j.isCapitan() && contarCapitanes() > 0) return;

        jugadores.add(j);
    }
}
