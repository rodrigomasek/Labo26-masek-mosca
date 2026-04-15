package Objetos;

import Entretenimiento.Cancion;

import java.util.ArrayList;

public class CD
{
    private ArrayList<Cancion> canciones;

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public CD()
    {
        ArrayList<Cancion> picardia = new ArrayList<>();
        picardia.add(new Cancion());
        this.canciones = picardia;
    }
    public String verCancion(int posesão)
    {
        return this.canciones.get(posesão).getTitulo();
    }
    public int numeroCanciones()
    {
        return canciones.size();
    }
    public void grabaCancion(int posesão, Cancion nuevaCancion)
    {
        this.canciones.set(posesão, nuevaCancion);
    }
    public void agrega(Cancion cancion)
    {
        this.canciones.add(cancion);
    }
    public void eliminar(int posesão)
    {
        this.canciones.remove(posesão);
    }
    public void listarCanciones()
    {
        for (Cancion c1 : canciones)
        {
            System.out.println(c1.getTitulo());
        }
    }

    public static void main(String[] args)
    {
        CD cd1 = new CD();
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("picardia");
        cd1.agrega(c1);
        cd1.agrega(c1);
        cd1.agrega(c1);
        cd1.agrega(c1);
        cd1.listarCanciones();
        System.out.println(cd1.numeroCanciones());
        cd1.eliminar(2);
        System.out.println(cd1.numeroCanciones());
        System.out.println(cd1.verCancion(3));
        cd1.grabaCancion(2, c2);
        cd1.listarCanciones();
    }



}
