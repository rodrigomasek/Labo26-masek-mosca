package administracion.sitio_web;

public class StockInsuficiente extends Exception {

    public StockInsuficiente(String mensaje) {
        super(mensaje);
    }
}
