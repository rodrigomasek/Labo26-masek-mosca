package Vehiculos;

public class Submarino {
    private String nombre;
    private float profundidadMax;
    private float profundidadActual = 0;

    public Submarino()
    {
        this.nombre = "juan";
        this.profundidadMax = 20000;
    }
    public float getProfundidadActual() {
        return profundidadActual;
    }
    public String getNombre() {
        return nombre;
    }
    public float getProfundidadMax() {
        return profundidadMax;
    }
    public void setProfundidadActual(float ProfundidadActual) {
        this.profundidadActual = ProfundidadActual;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProfundidadMax(float profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    public void sumergir(float abajo)
    {
        if((this.profundidadActual + abajo) > this.profundidadMax)
        {
            System.out.println("La profundidad es mayor a la tolerable");
        }
        else
        {
            profundidadActual = this.profundidadActual + abajo;
        }
    }
    public void emerger(float arriba)
    {
        if((this.profundidadActual - arriba) < 0)
        {
            System.out.println("Muy arriba");
        }
        else
        {
            profundidadActual = this.profundidadActual - arriba;
        }
    }

    public static void main(String[] args) {
        Submarino s1 = new Submarino();
        s1.sumergir(444440);
        s1.emerger(10);
    }
}

