package administracion.sitio_web.dispositivos;

public class DispositivosSalida extends Dispositivos{

    public DispositivosSalida(String nombreFabricante, String modelo, double precio, int stock, int puertosDisponibles) {
        super(nombreFabricante, modelo, precio, stock, puertosDisponibles);
    }

    public DispositivosSalida(int puertosDisponibles) {
        super();
    }
}
