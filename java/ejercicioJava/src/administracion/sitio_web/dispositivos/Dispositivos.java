package administracion.sitio_web.dispositivos;

import administracion.sitio_web.Componentes;

public class Dispositivos extends Componentes {
    private int puertosDisponibles;

    public Dispositivos(String nombreFabricante, String modelo, double precio, int stock, int puertosDisponibles) {
        super(nombreFabricante, modelo, precio, stock);
        this.puertosDisponibles = puertosDisponibles;
    }

    public int getPuertosDisponibles() {
        return puertosDisponibles;
    }

    public void setPuertosDisponibles(int puertosDisponibles) {
        this.puertosDisponibles = puertosDisponibles;
    }
}
