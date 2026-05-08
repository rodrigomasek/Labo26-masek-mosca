package Escuela;

import Animales.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList<String> listaContenidos;
    private ArrayList<Alumno> alumnoInscriptos;

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnoInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnoInscriptos) {
        this.alumnoInscriptos = alumnoInscriptos;
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
        this.alumnoInscriptos = new ArrayList<>();

    }
    public float promedioE()
    {
        float sum = 0;
        float cant = 0;
        int i = 0;
        for(Alumno a : alumnoInscriptos)
        {
            sum += LocalDate.now().getYear() - this.alumnoInscriptos.get(i).getFechaN().getYear();
            cant++;
        }
        return (sum/cant);
    }
    public void agregarA(Alumno a)
    {
        if(!this.alumnoInscriptos.contains(a))
        {
            this.alumnoInscriptos.add(a);
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
        for(Alumno a : this.alumnoInscriptos)
        {
            System.out.println(a.getNombre());
        }
    }


}

