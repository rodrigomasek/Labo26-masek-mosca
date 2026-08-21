package administracion.SistemaConsumoBebida;

abstract class Bebida {
    protected String nombre;
    protected double coeficientePositividad;
    protected double coeficienteNegatividad;

    public Bebida(String nombre, double coeficientePositividad, double coeficienteNegatividad) {
        this.nombre = nombre;
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public double getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public double calcularCoeficiente() {
        return coeficientePositividad - coeficienteNegatividad;
    }
}
