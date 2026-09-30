package administracion.sitio_web;

import java.util.ArrayList;

public class SitioWeb {

    private ArrayList<Compra> compras;

    public SitioWeb() {
        compras = new ArrayList<>();
    }

    public void realizarCompra(Compra compra)
            throws StockInsuficiente, ComputadoraInvalida {

        Computadora computadora = compra.getComputadora();

        // Primero verificamos que la computadora sea válida
        if (!computadora.esValida()) {
            throw new ComputadoraInvalida(
                    "La compra no puede realizarse: "
                            + "la computadora debe tener una CPU, "
                            + "al menos un dispositivo de entrada "
                            + "y al menos un dispositivo de salida."
            );
        }

        // Después verificamos el stock
        verificarStock(computadora);

        // Si no se lanzó ninguna excepción, realizamos la compra
        descontarStock(computadora);
        compras.add(compra);
    }

    private void verificarStock(Computadora computadora)
            throws StockInsuficiente{

        if (computadora.getCpu().getStock() <= 0) {
            throw new StockInsuficiente(
                    "No hay stock disponible de la CPU."
            );
        }

        for (var entrada : computadora.getEntradas()) {

            if (entrada.getStock() <= 0) {
                throw new StockInsuficiente(
                        "No hay stock disponible para el componente: "
                                + entrada.getModelo()
                );
            }
        }

        for (var salida : computadora.getSalidas()) {

            if (salida.getStock() <= 0) {
                throw new StockInsuficiente(
                        "No hay stock disponible para el componente: "
                                + salida.getModelo()
                );
            }
        }
    }

    private void descontarStock(Computadora computadora) {

        computadora.getCpu().disminuirStock();

        for (var entrada : computadora.getEntradas()) {
            entrada.disminuirStock();
        }

        for (var salida : computadora.getSalidas()) {
            salida.disminuirStock();
        }
    }

    public int cantidadEntradas(int indiceCompra) {

        Compra compra = compras.get(indiceCompra);

        return compra.getComputadora().cantidadEntradas();
    }

    public int cantidadSalidas(int indiceCompra) {

        Compra compra = compras.get(indiceCompra);

        return compra.getComputadora().cantidadSalidas();
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public Componentes componenteMasVendido() {

        ArrayList<Componentes> componentes = new ArrayList<>();

        for (Compra compra : compras) {

            Computadora pc = compra.getComputadora();

            componentes.add(pc.getCpu());
            componentes.addAll(pc.getEntradas());
            componentes.addAll(pc.getSalidas());
        }

        Componentes masVendido = null;
        int mayorCantidad = 0;

        for (Componentes componente : componentes) {

            int cantidad = 0;

            for (Componentes otro : componentes) {

                if (componente.getNombreFabricante()
                        .equals(otro.getNombreFabricante())
                        && componente.getModelo()
                        .equals(otro.getModelo())) {

                    cantidad++;
                }
            }

            if (cantidad > mayorCantidad) {
                mayorCantidad = cantidad;
                masVendido = componente;
            }
        }

        return masVendido;
    }
}
