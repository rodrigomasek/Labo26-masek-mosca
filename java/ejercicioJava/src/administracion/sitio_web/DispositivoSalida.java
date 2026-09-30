package administracion.sitio_web;

import administracion.sitio_web.Componentes;

public abstract class DispositivoSalida extends Componentes {

    private int cantidadPuertosValidos;

    public DispositivoSalida(
            String nombreFabricante,
            String modelo,
            double precio,
            int stock,
            int cantidadPuertosValidos) {

        super(nombreFabricante, modelo, precio, stock);
        this.cantidadPuertosValidos = cantidadPuertosValidos;
    }

    public int getCantidadPuertosValidos() {
        return cantidadPuertosValidos;
    }

    public void setCantidadPuertosValidos(int cantidadPuertosValidos) {
        this.cantidadPuertosValidos = cantidadPuertosValidos;
    }
}
