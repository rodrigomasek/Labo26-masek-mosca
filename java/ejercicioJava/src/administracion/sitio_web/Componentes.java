package administracion.sitio_web;

public class Componentes {
    private String nombreFabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Componentes(String nombreFabricante, String modelo, double precio, int stock) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Componentes() {

    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
