package administracion.control_calorias;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private HashSet<String> ingredientes;
    private int cantCalorias;

    public Plato(String nombre, HashSet<String> ingredientes, int cantCalorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantCalorias = cantCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }
}
