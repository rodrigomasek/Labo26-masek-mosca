package practica1;

public class Profesor extends Persona{
    private float porcentajeDesc;
    public Profesor(String nombre, String apellido, float porcentajeDesc)
    {
        super(nombre, apellido);
        this.porcentajeDesc = porcentajeDesc;
    }
    @Override
    public float verDescuento()
    {
        return this.porcentajeDesc;
    }
}
