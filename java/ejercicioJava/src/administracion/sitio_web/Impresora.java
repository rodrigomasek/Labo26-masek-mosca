package administracion.sitio_web;

public class Impresora extends DispositivoSalida {

    private MetodoImpresion metodoImpresion;

    public Impresora(
            String nombreFabricante,
            String modelo,
            double precio,
            int stock,
            int cantidadPuertosValidos,
            MetodoImpresion metodoImpresion) {

        super(
                nombreFabricante,
                modelo,
                precio,
                stock,
                cantidadPuertosValidos
        );

        this.metodoImpresion = metodoImpresion;
    }

    public MetodoImpresion getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(MetodoImpresion metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
