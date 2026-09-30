package administracion.sitio_web;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Cliente
        Cliente cliente = new Cliente(
                "Juan",
                "Perez",
                "1123456789"
        );

        // CPU
        CPU cpu = new CPU(
                "Intel",
                "Core i5",
                200000,
                5
        );

        // Componentes de entrada
        ArrayList<DispositivoEntrada> entradas = new ArrayList<>();

        Teclado teclado = new Teclado(
                "Logitech",
                "K120",
                30000,
                3,
                "USB",
                1
        );

        entradas.add(teclado);

        // Componentes de salida
        ArrayList<DispositivoSalida> salidas = new ArrayList<>();

        Pantalla pantalla = new Pantalla(
                "Samsung",
                "24 pulgadas",
                150000,
                2,
                1
        );

        salidas.add(pantalla);

        // Crear computadora
        Computadora computadora = new Computadora(
                cpu,
                entradas,
                salidas
        );

        // Método de pago
        MetodoPago metodoPago = new Efectivo();

        // Crear compra
        Compra compra = new Compra(
                cliente,
                metodoPago,
                computadora
        );

        // Crear sitio web
        SitioWeb sitio = new SitioWeb();

        // Intentar realizar la compra
        try {

            sitio.realizarCompra(compra);

            System.out.println("Compra realizada correctamente.");

            compra.mostrarDetalle();

        } catch (StockInsuficiente e) {

            System.out.println("ERROR: " + e.getMessage());

        } catch (ComputadoraInvalida e) {

            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
