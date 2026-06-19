package plataformas.recetas_cocina.platos;

import enums.Dificultad;

import java.util.ArrayList;

public class Entrada extends Plato {
    private boolean temperatura;

    public Entrada(String plato, Dificultad dificultad, ArrayList<String> pasos, boolean temperatura) {
        super(plato, dificultad, pasos);
        this.temperatura = temperatura;
    }

    public boolean isTemperatura() {
        return temperatura;
    }

    public void setTemperatura(boolean temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String mostrar(){
        String texto = "";

        if(temperatura){
            for(String p : getPasos()){
                texto += p + " - ";
            }
            return "prende el horno antes de empezar | " + "los pasos son: " + texto;
        }
        else{
            return "los pasos son: " + texto + " | guarda la preparacion en la heladera";
        }
    }
}
