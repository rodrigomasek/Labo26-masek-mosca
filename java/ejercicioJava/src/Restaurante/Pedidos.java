package Restaurante;

import Animales.Profesor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedidos {
    private ArrayList<Pedido> pedidos;

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Pedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void listar(LocalDate f)
    {
        double precio;
        String tipo;
        for(Pedido p : pedidos)
        {
            tipo = p.getClass().getSimpleName();
            precio = (p.getPlatillo().getPrecio());
            if (tipo.equals("Profesor"))
            {
                precio = (p.getPlatillo().getPrecio()) - (1-(((Profesor)p.getPersona()).getPorcentajeDesc()) / 100);
            }
            if(f == p.getfCreacion())
            {
                System.out.println(p.getPlatillo().getNombre() + " Precio " + precio );
            }
        }
    }

    public void agregarPedido(Pedido p){ this.pedidos.add(p);}
}

