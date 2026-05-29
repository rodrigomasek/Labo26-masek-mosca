package administracion.sitio_web.perifericos;

import administracion.sitio_web.dispositivos.DispositivosSalida;

public class Impresora extends DispositivosSalida {
    private Boolean metodoImpresion;

    public Impresora(int puertosDisponibles, Boolean metodoImpresion) {
        super(puertosDisponibles);
        this.metodoImpresion = metodoImpresion;
    }

    public Boolean getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(Boolean metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
