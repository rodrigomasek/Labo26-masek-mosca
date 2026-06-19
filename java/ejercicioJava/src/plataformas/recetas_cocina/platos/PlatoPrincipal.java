package plataformas.recetas_cocina.platos;

import enums.Dificultad;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato {
    private int tiempo;
    private int numComensales;

    public PlatoPrincipal(String plato, Dificultad dificultad, ArrayList<String> pasos, int tiempo, int numComensales) {
        super(plato, dificultad, pasos);
        this.tiempo = tiempo;
        this.numComensales = numComensales;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    @Override
    public String mostrar(){
        String texto = "";

        for(String p : getPasos()){
            texto += p + " - ";
        }
        return "Esta receta tarda en cocinarse: " + tiempo + " | los pasos son: " + texto;
    }
}
