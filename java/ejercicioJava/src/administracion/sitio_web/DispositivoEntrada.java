package administracion.sitio_web;

import administracion.sitio_web.Componentes;

public abstract class DispositivoEntrada extends Componentes {

    private String tipoConector;
    private int cantidadPuertosValidos;

    public DispositivoEntrada(
            String nombreFabricante,
            String modelo,
            double precio,
            int stock,
            String tipoConector,
            int cantidadPuertosValidos) {

        super(nombreFabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.cantidadPuertosValidos = cantidadPuertosValidos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public int getCantidadPuertosValidos() {
        return cantidadPuertosValidos;
    }

    public void setCantidadPuertosValidos(int cantidadPuertosValidos) {
        this.cantidadPuertosValidos = cantidadPuertosValidos;
    }
}
