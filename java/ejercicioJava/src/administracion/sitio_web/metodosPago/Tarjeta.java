package administracion.sitio_web.metodosPago;

public class Tarjeta extends MetodoPago{
    private int numeroTarjeta;
    private String banco;
    private boolean tipo;

    public Tarjeta(String nombre, int numeroTarjeta, String banco, boolean tipo) {
        super(nombre);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipo = tipo;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double aplicarRecargo(double precioFinal) {
        double recargo = precioFinal * 0.05;
        return precioFinal + recargo;
    }
}
