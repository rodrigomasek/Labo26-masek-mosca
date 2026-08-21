package administracion.SistemaConsumoBebida;

class Consumo {
    private Bebida bebida;
    private int cantidad;

    public Consumo(Bebida bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularCoeficiente() {
        return cantidad * bebida.calcularCoeficiente();
    }
}
