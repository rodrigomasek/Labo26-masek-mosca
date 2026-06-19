package practica2;

import java.util.ArrayList;

public class Concesionaria {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria()
    {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public Concesionaria(ArrayList<Vehiculo> vehiculos)
    {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void eliminar(int indice)
    {
        this.vehiculos.remove(indice);
    }
    public void modificar(int indice, Vehiculo vehiculo)
    {
        this.vehiculos.set(indice, vehiculo);
    }
    public void agregar(Vehiculo vehiculo)
    {
        this.vehiculos.add(vehiculo);
    }
    public Vehiculo masCaro()
    {
        Vehiculo vehiculoMasCaro = this.vehiculos.getFirst();
        for(Vehiculo v: this.vehiculos)
        {
            if(v.getPrecio() > vehiculoMasCaro.getPrecio())
            {
                vehiculoMasCaro = v;
            }
        }
        return vehiculoMasCaro;
    }
    public Vehiculo masBarato()
    {
        Vehiculo vehiculoMasBarato = this.vehiculos.getFirst();
        for (Vehiculo v : this.vehiculos)
        {
            if(v.getPrecio() < vehiculoMasBarato.getPrecio())
            {
                vehiculoMasBarato = v;
            }
        }
        return vehiculoMasBarato;
    }
    public void listarPorCategoria(String categoria)
    {
        for (Vehiculo v : this.vehiculos)
        {
            if(v.getClass().getSimpleName().equals(categoria))
            {
                System.out.println(v.getPatente());
            }
        }
    }
    public void verPorCombustible()
    {
        Combustible[] combustibles = Combustible.values();
        for (Combustible c : combustibles)
        {
            System.out.println(c.name() + ": ");
            for (Vehiculo v : this.vehiculos)
            {
                if(v instanceof Automovil auto && auto.getCombustible() == c)
                {
                    System.out.println(auto.getPatente());
                }
            }
        }
    }

    public static void main(String[] args) {
        Concesionaria c1 = new Concesionaria();

        Vehiculo v1 = new Automovil("124aab", "ferrari", "2.0", 10000, 3, Combustible.NAFTA);
        Vehiculo v2 = new Automovil("1248ab", "ferrari", "2.0", 1006700, 3, Combustible.DIESEL);
        Vehiculo v3 = new Automovil("12488b", "ferrari", "2.0", 100777600, 3, Combustible.HIBRIDO);
        Vehiculo v4 = new Automovil("124asb", "ferrari", "2.0", 1000076, 3, Combustible.NAFTA);
        c1.agregar(v1);
        c1.agregar(v2);
        c1.agregar(v3);
        c1.agregar(v4);
        System.out.println(c1.masCaro().getPatente());
        System.out.println(c1.masBarato().getPatente());
        c1.listarPorCategoria("Automovil");
        c1.verPorCombustible();
    }
}
