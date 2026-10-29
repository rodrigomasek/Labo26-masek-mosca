package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

public class Galletita extends Preparacion implements Vendible{
    private float biarbonato;
    private Cubierta topico;

    public Galletita(float harina, float azucar, float manteca, int huevos, double pUnitario, int stockHecho, float biarbonato, Cubierta topico) {
        super(harina, azucar, manteca, huevos, pUnitario, stockHecho);
        this.biarbonato = biarbonato;
        this.topico = topico;
    }

    public float getBiarbonato() {
        return biarbonato;
    }

    public void setBiarbonato(float biarbonato) {
        this.biarbonato = biarbonato;
    }

    public Cubierta getTopico() {
        return topico;
    }

    public void setTopico(Cubierta topico) {
        this.topico = topico;
    }

    @Override
    public void conocerReceta() {
        System.out.println("Arranca partiendo el chocolate...");
    }

    @Override
    public void actualizarStock(int cant) throws StockInsuficienteException {
        if(cant <= this.getStockHecho()){
            System.out.println("Stock suficiente");
        }else
        {
            throw new StockInsuficienteException("No hay stock suficiente");
        }
    }

    @Override
    public String descripcionVenta() {
        return "Animate a probar las mejores galletitas del mercado.";
    }

    @Override
    public double calcularPrecio(int cant) {
        double precio = getpUnitario() * cant;
        System.out.println(precio);
        return precio;
    }

    @Override
    public double vender(int cant) {
        return 0;
    }


}
