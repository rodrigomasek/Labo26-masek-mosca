package Lugares.museo;

import enums.NivelConservacion;

public class Cuadro {

    private String titulo;
    private String pintor;
    private int anioCreacion;
    private NivelConservacion conservacion;

    public Cuadro(String titulo, String pintor, int anioCreacion, NivelConservacion conservacion) {
        this.titulo = titulo;
        this.pintor = pintor;
        this.anioCreacion = anioCreacion;
        this.conservacion = conservacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPintor() {
        return pintor;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public NivelConservacion getConservacion() {
        return conservacion;
    }

    public void setConservacion(NivelConservacion conservacion) {
        this.conservacion = conservacion;
    }
}