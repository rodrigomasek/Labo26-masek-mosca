package Restaurante;

import Animales.Alumno;
import Animales.Persona;
import Animales.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

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

    public void pasarAentregado()
    {
        this.entregado = true;
    }

    public static void main(String[] args)
    {
        // PLATOS
        Platillo pizza = new Platillo(4000, "Pizza");
        Platillo milanesa = new Platillo(3500, "Milanesa");
        Platillo empanada = new Platillo(2000, "Empanada");

        // PERSONAS
        Alumno a1 = new Alumno();
        a1.setNombre("Juan");

        Profesor prof1 = new Profesor("Carlos", "Lopez", LocalDate.of(1980, 5, 10), 20);

        // SISTEMA
        Pedidos pedidos = new Pedidos(new ArrayList<>());

        // PEDIDOS
        pedidos.agregarPedido(new Pedido(false, LocalTime.of(12, 0), a1, pizza, LocalDate.now()));

        pedidos.agregarPedido(new Pedido(false, LocalTime.of(12, 30), prof1, pizza, LocalDate.now()));

        pedidos.agregarPedido(new Pedido(false, LocalTime.of(13, 0), a1, milanesa, LocalDate.now()));

        pedidos.agregarPedido(new Pedido(true, LocalTime.of(13, 30), prof1, empanada, LocalDate.now()));

        pedidos.agregarPedido(new Pedido(false, LocalTime.of(14, 0), a1, pizza, LocalDate.now()));

        // LISTAR POR FECHA
        System.out.println("PEDIDOS DEL DIA:");
        pedidos.listarPorFecha(LocalDate.now());

        // PENDIENTES
        System.out.println("\nPENDIENTES:");
        pedidos.listarPorNoEntregado();

        // TOP 3
        System.out.println("\nTOP 3:");
        pedidos.top3Platos();
    }
}