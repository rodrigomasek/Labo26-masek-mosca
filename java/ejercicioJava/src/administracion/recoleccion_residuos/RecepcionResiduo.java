package administracion.recoleccion_residuos;

import administracion.recoleccion_residuos.Residuo;

public class RecepcionResiduo {
    private Residuo residuo;
    private double cantidad;

    public RecepcionResiduo(Residuo residuo, double cantidad) {
        this.residuo = residuo;
        this.cantidad = cantidad;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
