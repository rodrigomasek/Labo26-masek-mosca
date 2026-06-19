package practica2;

public class Automovil extends Vehiculo{
    private int cantPuertas;
    private Combustible combustible;

    public Automovil(String patente, String marca, String modelo, double precio, int cantPuertas, Combustible combustible)
    {
        super(patente, marca, modelo, precio);
        this.cantPuertas = cantPuertas;
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


}
