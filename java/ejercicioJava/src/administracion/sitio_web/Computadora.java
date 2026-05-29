package administracion.sitio_web;

import administracion.sitio_web.dispositivos.DispositivosEntrada;
import administracion.sitio_web.dispositivos.DispositivosSalida;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<DispositivosEntrada> entradas;
    private ArrayList<DispositivosSalida> salidas;

    public Computadora(CPU cpu, ArrayList<DispositivosEntrada> entradas, ArrayList<DispositivosSalida> salidas) {
        this.cpu = cpu;
        this.entradas = entradas;
        this.salidas = salidas;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<DispositivosEntrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<DispositivosEntrada> entradas) {
        this.entradas = entradas;
    }

    public ArrayList<DispositivosSalida> getSalidas() {
        return salidas;
    }

    public void setSalidas(ArrayList<DispositivosSalida> salidas) {
        this.salidas = salidas;
    }


}
