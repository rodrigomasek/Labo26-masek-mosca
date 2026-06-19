package plataformas.recetas_cocina.platos;

import enums.Dificultad;

import java.util.ArrayList;

public abstract class Plato {
    private String plato;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Plato(String plato, Dificultad dificultad, ArrayList<String> pasos) {
        this.plato = plato;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public abstract String mostrar();
}
