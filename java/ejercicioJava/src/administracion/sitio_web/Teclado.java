package administracion.sitio_web;

public class Teclado extends DispositivoEntrada {

    public Teclado(
            String nombreFabricante,
            String modelo,
            double precio,
            int stock,
            String tipoConector,
            int cantidadPuertosValidos) {

        super(
                nombreFabricante,
                modelo,
                precio,
                stock,
                tipoConector,
                cantidadPuertosValidos
        );
    }
}
