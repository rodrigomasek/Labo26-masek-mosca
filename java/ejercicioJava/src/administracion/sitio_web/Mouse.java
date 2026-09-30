package administracion.sitio_web;

public class Mouse extends DispositivoEntrada {

    public Mouse(
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