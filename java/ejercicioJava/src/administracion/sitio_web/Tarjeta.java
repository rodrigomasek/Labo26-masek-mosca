package administracion.sitio_web;

public class Tarjeta extends MetodoPago {

    private String numero;
    private String banco;
    private TipoTarjeta tipo;

    public Tarjeta(String numero, String banco, TipoTarjeta tipo) {
        this.numero = numero;
        this.banco = banco;
        this.tipo = tipo;
    }

    @Override
    public double calcularRecargo(double subtotal) {
        return subtotal * 0.05;
    }

    public String getNumero() {
        return numero;
    }

    public String getBanco() {
        return banco;
    }

    public TipoTarjeta getTipo() {
        return tipo;
    }
}
