package practica2;

public class Motocicleta extends Vehiculo{
    private int cilindrada;
    private Uso tipoDeUso;

    public Motocicleta(String patente, String marca, String modelo, double precio, int cilindrada, Uso tipoDeUso)
    {
        super(patente, marca, modelo, precio);
        this.cilindrada = cilindrada;
        this.tipoDeUso = tipoDeUso;
    }

    public Uso getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(Uso tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
