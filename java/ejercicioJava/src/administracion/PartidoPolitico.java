package administracion;

import Animales.Fabricante;
import Animales.PalomaMensajera;
import Animales.Trabajador;
import Objetos.TelefonoMovil;
import enums.CompañiaTelefonica;
import interfaces.Mensajero;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> enviadores;

    public PartidoPolitico(String nombre, String direccion, int cantAfiliados, HashSet<Mensajero> enviadores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.enviadores = enviadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajero> getEnviadores() {
        return enviadores;
    }

    public void setEnviadores(HashSet<Mensajero> enviadores) {
        this.enviadores = enviadores;
    }

    public void aniadirMensajero(Mensajero nuevoMensajero)
    {
        enviadores.add(nuevoMensajero);
    }

    public void hacerCampaña()
    {
        for (Mensajero m : this.enviadores)
        {
            m.mensaje();
        }
    }

    public static void main(String[] args) {
        // Crear una paloma mensajera
        PalomaMensajera paloma = new PalomaMensajera(
                "Blanca",
                "Piquito",
                "Paloma doméstica",
                true
        );

        // Crear un fabricante
        Fabricante fabricante = new Fabricante(
                "Juan",
                "Perez",
                LocalDate.of(1980, 5, 10),
                "Electrónica"
        );

        // Crear un teléfono móvil
        TelefonoMovil telefono = new TelefonoMovil(
                "12345",
                fabricante,
                "Samsung A54",
                "1123456789",
                CompañiaTelefonica.PERSONAL
        );

        // Crear un trabajador
        Trabajador trabajador = new Trabajador(
                "Carlos",
                "Gomez",
                LocalDate.of(1990, 3, 15),
                "Av. Siempre Viva 123",
                "20-12345678-9",
                500000,
                LocalTime.of(8, 0),
                LocalTime.of(18, 0)
        );

        // Crear el conjunto de mensajeros
        HashSet<Mensajero> mensajeros = new HashSet<>();

        mensajeros.add(paloma);
        mensajeros.add(telefono);
        mensajeros.add(trabajador);

        // Crear el partido político
        PartidoPolitico partido = new PartidoPolitico(
                "Partido del Futuro",
                "Av. Principal 456",
                1000,
                mensajeros
        );

        // Realizar la campaña
        partido.hacerCampaña();
    }

}
