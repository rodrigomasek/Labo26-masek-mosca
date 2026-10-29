package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

public interface Vendible {
    void actualizarStock(int cant);
    String descripcionVenta();
    double calcularPrecio(int cant);
    double vender(int cant);

}
