package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

public class Brownie extends Preparacion implements Vendible{
    private float chocolate;

    public Brownie(float harina, float azucar, float manteca, int huevos, double pUnitario, int stockHecho, float chocolate) {
        super(harina, azucar, manteca, huevos, pUnitario, stockHecho);
        this.chocolate = chocolate;
    }

    public float getChocolate() {
        return chocolate;
    }

    public void setChocolate(float chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public void conocerReceta() {
        System.out.println("Derreti la manteca...");
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
        return "Brownies bien humedos... ";
    }

    @Override
    public double calcularPrecio(int cant) {
        double precio = getpUnitario() * cant;
        System.out.println(precio);
        return precio;
    }

    @Override
    public double vender(int cant) throws StockInsuficienteException{
        double impacto = 0;
        try {
            actualizarStock(cant);
            impacto = calcularPrecio(cant);
        }catch (StockInsuficienteException e){
            throw new StockInsuficienteException(e.getMessage());
        }
        return impacto;
    }


}
