package Restaurante;

import Animales.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fCreacion;
    private Platillo platillo;
    private Persona  persona;
    private LocalTime hora;
    private boolean entregado;

    public Pedido(boolean entregado, LocalTime hora, Persona persona, Platillo platillo, LocalDate fCreacion) {
        this.entregado = entregado;
        this.hora = hora;
        this.persona = persona;
        this.platillo = platillo;
        this.fCreacion = fCreacion;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public void setfCreacion(LocalDate fCreacion) {
        this.fCreacion = fCreacion;
    }

    public static void main(String[] args) {

    }
}
