package practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Platillo> menu;
    private ArrayList<Pedido> pedidos;

    public Menu(ArrayList<Platillo> menu, ArrayList<Pedido> pedidos) {
        this.menu = menu;
        this.pedidos = pedidos;
    }

    public ArrayList<Platillo> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Platillo> menu) {
        this.menu = menu;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void agregar(Platillo platillo)
    {
        this.menu.add(platillo);
    }
    public void modificar(int posicion, Platillo platillo)
    {
        this.menu.set(posicion, platillo);
    }
    public void eliminar(int posicion)
    {
        this.menu.remove(posicion);
    }
    public void mostrar(LocalDate fecha)
    {
        for(Pedido p : pedidos)
        {
            if(p.getfCreacion().equals(fecha))
            {
                System.out.println(p.getPlatillo());
                System.out.println(p.precioFinal());
            }
        }
    }
    public int indice(ArrayList<Platillo> platillos, Platillo platillo)
    {
        int i = 0;
        int indice = 0;
        for(i = 0; i < platillos.size(); i++)
        {
            if(platillo == platillos.get(i))
            {
                indice = i;
            }
        }
        return indice;
    }
    public void platillosMasPedidos()
    {

        ArrayList<Platillo> platillos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();;
        for(Pedido p : this.pedidos)
        {
            if (!platillos.contains(p.getPlatillo()))
            {
                platillos.add(p.getPlatillo());
                cantidades.add(1);
            }
            else
            {
                cantidades.set(indice(platillos, p.getPlatillo()), cantidades.get(indice(platillos, p.getPlatillo())) + 1);
            }
        }
        for (int i = 0; i < cantidades.size() - 1; i++) {
            for (int j = 0; j < cantidades.size() - 1 - i; j++) {
                if (cantidades.get(j) < cantidades.get(j + 1)) {

                    // Intercambiar cantidades
                    int auxCant = cantidades.get(j);
                    cantidades.set(j, cantidades.get(j + 1));
                    cantidades.set(j + 1, auxCant);

                    // Intercambiar platillos
                    Platillo auxPlat = platillos.get(j);
                    platillos.set(j, platillos.get(j + 1));
                    platillos.set(j + 1, auxPlat);
                }
            }
        }
    }
}
