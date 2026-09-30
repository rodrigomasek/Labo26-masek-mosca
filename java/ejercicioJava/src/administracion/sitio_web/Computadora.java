package administracion.sitio_web;

import administracion.sitio_web.DispositivoEntrada;
import administracion.sitio_web.DispositivoSalida;

import java.util.ArrayList;

public class Computadora {

    private CPU cpu;
    private ArrayList<DispositivoEntrada> entradas;
    private ArrayList<DispositivoSalida> salidas;

    public Computadora(
            CPU cpu,
            ArrayList<DispositivoEntrada> entradas,
            ArrayList<DispositivoSalida> salidas) {

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

    public ArrayList<DispositivoEntrada> getEntradas() {
        return entradas;
    }

    public ArrayList<DispositivoSalida> getSalidas() {
        return salidas;
    }

    public double calcularPrecio() {

        double total = cpu.getPrecio();

        for (DispositivoEntrada entrada : entradas) {
            total += entrada.getPrecio();
        }

        for (DispositivoSalida salida : salidas) {
            total += salida.getPrecio();
        }

        return total;
    }

    public int cantidadEntradas() {
        return entradas.size();
    }

    public int cantidadSalidas() {
        return salidas.size();
    }

    public boolean esValida() {

        return cpu != null
                && !entradas.isEmpty()
                && !salidas.isEmpty();
    }

}
