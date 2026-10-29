package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashMap<Preparacion, Integer> preparacionesYstock;
    private HashMap<Preparacion, Integer> historial;

    public Sistema(HashMap<Preparacion, Integer> preparacionesYstock, HashMap<Preparacion, Integer> historial) {
        this.preparacionesYstock = preparacionesYstock;
        this.historial = historial;
    }

    public HashMap<Preparacion, Integer> getPreparacionesYstock() {
        return preparacionesYstock;
    }

    public void setPreparacionesYstock(HashMap<Preparacion, Integer> preparacionesYstock) {
        this.preparacionesYstock = preparacionesYstock;
    }

    public HashMap<Preparacion, Integer> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<Preparacion, Integer> historial) {
        this.historial = historial;
    }

    public void registrarVenta(Vendible producto, int cant)
    {
        try {
            producto.vender(cant);
            this.historial.put((Preparacion) producto, cant + this.historial.get(producto));
            System.out.println("Venta cargada con exito");
        }catch (StockInsuficienteException a)
        {
            System.out.println(a.getMessage());
        }

    }
}
