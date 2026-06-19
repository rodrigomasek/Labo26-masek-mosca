package practica2;

public class Camiones extends Vehiculo{
    private float capacidadMax;
    private int ejes;

    public Camiones(String patente, String marca, String modelo, double precio, float capacidadMax, int ejes)
    {
        super(patente, marca, modelo, precio);
        this.capacidadMax = capacidadMax;
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public float getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(float capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
}
