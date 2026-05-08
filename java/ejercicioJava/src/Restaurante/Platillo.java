package Restaurante;

public class Platillo {
    private String nombre;
    private double precio;

    public Platillo(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void main(String[] args) {

    }
}

