package administracion.sitio_web;

public class Efectivo extends MetodoPago {

    @Override
    public double calcularRecargo(double subtotal) {
        return 0;
    }
}
