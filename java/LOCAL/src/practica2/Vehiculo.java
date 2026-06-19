package practica2;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String patente, String marca, String modelo, double precio)
    {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void setPatente(String patente)
    {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPatente()
    {
        return this.patente;
    }

}
