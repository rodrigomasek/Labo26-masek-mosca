package administracion.sistemaBars;

import enums.ColorDianas;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private int nivelDificultad;
    private HashMap<Integer, ColorDianas> puntajeColor;

    public Diana(String nombre, int nivelDificultad, HashMap<Integer, ColorDianas> puntajeColor) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.puntajeColor = puntajeColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public HashMap<Integer, ColorDianas> getPuntajeColor() {
        return puntajeColor;
    }

    public void setPuntajeColor(HashMap<Integer, ColorDianas> puntajeColor) {
        this.puntajeColor = puntajeColor;
    }

    public abstract double calcularArea();


}
