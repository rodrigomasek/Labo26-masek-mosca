package administracion.SistemaConsumoBebida;

class BebidaAzucarada extends Bebida {
    private double cantidadAzucar;

    public BebidaAzucarada(String nombre, double cantidadAzucar) {
        super(nombre, 1, cantidadAzucar * 10);
        this.cantidadAzucar = cantidadAzucar;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }
}