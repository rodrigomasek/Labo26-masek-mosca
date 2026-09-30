package administracion.sitio_web;

public class Pantalla extends DispositivoSalida {

    public Pantalla(
            String nombreFabricante,
            String modelo,
            double precio,
            int stock,
            int cantidadPuertosValidos) {

        super(
                nombreFabricante,
                modelo,
                precio,
                stock,
                cantidadPuertosValidos
        );
    }
}
