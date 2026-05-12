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

    public void agregarPedido(Pedido p){ this.pedidos.add(p);}

    public Pedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void listarPorFecha(LocalDate f)
    {
        double precio;
        for(Pedido p : this.pedidos)
        {
            if(f.equals(p.getfCreacion()))
            {
                precio = p.getPlatillo().getPrecio();
                if (p.getPersona() instanceof Profesor profe)
                {
                    precio = precio * (1 - profe.getPorcentajeDesc() / 100);
                }

                System.out.println(
                        "Platillo: " + p.getPlatillo().getNombre() +
                                " | Precio final: $" + precio
                );
            }
        }
    }
    public void listarPorNoEntregado()
    {
        int i = 0;
        for (Pedido p : this.pedidos)
        {
            i++;
            if(!(p.isEntregado()))
            {
                System.out.println("El pedido numero " + i + ", que tiene un platillo de " + p.getPlatillo().getNombre() + " todavia no se entrego");
            }
        }
    }
    public int contarPedidos(String nombrePlato)
    {
        int contador = 0;

        for (Pedido p : this.pedidos)
        {
            if (p.getPlatillo().getNombre().equals(nombrePlato))
            {
                contador++;
            }
        }

        return contador;
    }

    public void top3Platos()
    {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        String top1 = "";
        String top2 = "";
        String top3 = "";

        for (Pedido p : this.pedidos)
        {
            String nombrePlato = p.getPlatillo().getNombre();

            // Evitar repetir
            if (nombrePlato.equals(top1) ||
                    nombrePlato.equals(top2) ||
                    nombrePlato.equals(top3))
            {
                continue;
            }

            int contador = contarPedidos(nombrePlato);

            if (contador > max1)
            {
                max3 = max2;
                top3 = top2;

                max2 = max1;
                top2 = top1;

                max1 = contador;
                top1 = nombrePlato;
            }
            else if (contador > max2)
            {
                max3 = max2;
                top3 = top2;

                max2 = contador;
                top2 = nombrePlato;
            }
            else if (contador > max3)
            {
                max3 = contador;
                top3 = nombrePlato;
            }
        }

        System.out.println("TOP 3 PLATOS MÁS PEDIDOS:");

        System.out.println("1- " + top1 + " -> " + max1);
        System.out.println("2- " + top2 + " -> " + max2);
        System.out.println("3- " + top3 + " -> " + max3);
    }



    public static void main(String[] args) {

    }
}

