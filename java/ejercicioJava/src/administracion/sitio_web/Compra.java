package administracion.sitio_web;

public class Compra {

    private Cliente cliente;
    private MetodoPago metodoPago;
    private Computadora computadora;

    public Compra(
            Cliente cliente,
            MetodoPago metodoPago,
            Computadora computadora) {

        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.computadora = computadora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public double calcularSubtotal() {
        return computadora.calcularPrecio();
    }

    public double calcularRecargo() {
        return metodoPago.calcularRecargo(calcularSubtotal());
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularRecargo();
    }

    public void mostrarDetalle() {

        System.out.println("----- DETALLE DE COMPRA -----");

        System.out.println("Cliente: "
                + cliente.getNombre() + " "
                + cliente.getApellido());

        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Recargo: $" + calcularRecargo());
        System.out.println("Total: $" + calcularTotal());
    }
}
