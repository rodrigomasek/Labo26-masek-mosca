package Lugares.tienda_electronica;

import enums.Categoria_Electronica;
import enums.Tecnoligia;

import java.util.ArrayList;

public class Tienda_Electronica {
    private ArrayList<Producto> productos;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Tienda_Electronica(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void borrar(int posicion)
    {
        this.productos.remove(posicion);
    }
    public void agregar(Producto producto)
    {
        this.productos.add(producto);
    }
    public void modificar(int posicion, Producto producto)
    {
        this.productos.set(posicion, producto);
    }

    public Producto productoMayorStock() {
        Producto max = productos.get(0);

        for (Producto p : productos) {
            if (p.getStock() > max.getStock()) {
                max = p;
            }
        }
        return max;
    }

    public Producto productoMenorStock() {
        Producto men = productos.get(0);

        for (Producto p : productos) {
            if (p.getStock() < men.getStock()) {
                men = p;
            }
        }
        return men;
    }

    public void mostrar(Categoria_Electronica categoria)
    {
        for(Producto p : this.productos)
        {
            if(p.getCategoria() == categoria)
            {
                System.out.println(p.getNombre());
            }
        }
    }

    public static void main(String[] args) {

            Producto p1 = new Televisores(10, 1500.0, "Samsung TV");
            ((Televisores) p1).setTecnoligia(Tecnoligia.CUATRO_K);

            Producto p2 = new Equipo_Sonido(25, 300.0, "JBL Speaker", true);
            Producto p3 = new Cargadores_Portatiles(5, 50.0, "Anker PowerBank");
            ((Cargadores_Portatiles) p3).setCantSinCargar(2);

            Producto p4 = new Televisores(2, 2000.0, "LG OLED");
            ((Televisores) p4).setTecnoligia(Tecnoligia.FULLHD);


            ArrayList<Producto> lista = new ArrayList<>();
            lista.add(p1);
            lista.add(p2);
            lista.add(p3);

            Tienda_Electronica tienda = new Tienda_Electronica(lista);

            System.out.println("=== PRODUCTOS INICIALES ===");
            for (Producto p : tienda.getProductos()) {
                System.out.println(p.getNombre() + " - stock: " + p.getStock());
            }

            tienda.agregar(p4);
            System.out.println("\nAgregamos LG OLED");

            Producto nuevo = new Equipo_Sonido(100, 999.0, "Sony Speaker Pro", true);
            tienda.modificar(0, nuevo);
            System.out.println("Modificamos posición 0");

            tienda.borrar(2);
            System.out.println("Borramos posición 2");

            System.out.println("\n=== PRODUCTOS FINALES ===");
            for (Producto p : tienda.getProductos()) {
                System.out.println(p.getNombre() + " - stock: " + p.getStock());
            }

            Producto max = tienda.productoMayorStock();
            System.out.println("\nMayor stock: " + max.getNombre() + " (" + max.getStock() + ")");

            Producto min = tienda.productoMenorStock();
            System.out.println("Menor stock: " + min.getNombre() + " (" + min.getStock() + ")");

            System.out.println("\n=== SOLO MULTIMEDIA ===");
            tienda.mostrar(Categoria_Electronica.MULTIMEDIA);

        }
    }


