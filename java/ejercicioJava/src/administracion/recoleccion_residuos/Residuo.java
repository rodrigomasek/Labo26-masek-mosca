package administracion.recoleccion_residuos;

public class Residuo {
    private String nombre;
    private boolean reciclable;
    private String descripcionTratamiento;

    public Residuo(String nombre, boolean reciclable, String descripcionTratamiento) {
        this.nombre = nombre;
        this.reciclable = reciclable;
        this.descripcionTratamiento = descripcionTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isReciclable() {
        return reciclable;
    }

    public String getDescripcionTratamiento() {
        return descripcionTratamiento;
    }

    public void modificar(String nombre, boolean reciclable, String descripcionTratamiento) {
        this.nombre = nombre;
        this.reciclable = reciclable;
        this.descripcionTratamiento = descripcionTratamiento;
    }
}
