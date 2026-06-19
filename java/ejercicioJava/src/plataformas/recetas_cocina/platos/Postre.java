package plataformas.recetas_cocina.platos;

import enums.Dificultad;

import java.util.ArrayList;

public class Postre extends Plato {
    private int temperaturaHorno;
    private boolean diabeticos;

    public Postre(String plato, Dificultad dificultad, ArrayList<String> pasos, int temperaturaHorno, boolean diabeticos) {
        super(plato, dificultad, pasos);
        this.temperaturaHorno = temperaturaHorno;
        this.diabeticos = diabeticos;
    }

    public int getTemperaturaHorno() {
        return temperaturaHorno;
    }

    public void setTemperaturaHorno(int temperaturaHorno) {
        this.temperaturaHorno = temperaturaHorno;
    }

    public boolean isDiabeticos() {
        return diabeticos;
    }

    public void setDiabeticos(boolean diabeticos) {
        this.diabeticos = diabeticos;
    }

    @Override
    public String mostrar(){
        String texto = "";

        for(String p : getPasos()){
            texto += p + " mantener la cocina limpia y el horno a minimo";
        }
        return "los pasos son: " + texto;
    }
}
