package Escuela;

import Animales.Alumnos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList<String> listaContenidos;
    private ArrayList<Alumnos> alumnosInscriptos;

    public ArrayList<Alumnos> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumnos> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia()
    {
        this.nombre = "";
        this.listaContenidos = new ArrayList<>();
        this.alumnosInscriptos = new ArrayList<>();

    }
    public float promedioE()
    {
        float sum = 0;
        float cant = 0;
        int i = 0;
        for(Alumnos a : alumnosInscriptos)
        {
            sum += LocalDate.now().getYear() - this.alumnosInscriptos.get(i).getFechaN().getYear();
            cant++;
        }
        return (sum/cant);
    }
    public void agregarA(Alumnos a)
    {
        if(!this.alumnosInscriptos.contains(a))
        {
            this.alumnosInscriptos.add(a);
        }

    }
    public void agregarC(String c)
    {
        if(!this.listaContenidos.contains(c))
        {
            this.listaContenidos.add(c);
        }
    }
    public void listar()
    {
        int i = 0;
        for(Alumnos a : this.alumnosInscriptos)
        {
            System.out.println(a.getNombre());
        }
    }


}

