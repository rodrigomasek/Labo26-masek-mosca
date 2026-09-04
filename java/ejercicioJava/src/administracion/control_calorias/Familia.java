package administracion.control_calorias;

import java.util.ArrayList;
import java.util.HashSet;

public class Familia {
    private HashSet<Persona> personas;

    public Familia(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public HashSet<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(HashSet<Persona> personas) {
        this.personas = personas;
    }

    public Persona mayorCalorias(){
        Persona p = null;

        for(Persona persona : personas){
            if(p == null || persona.calcularCaloriasConsumidas() > p.calcularCaloriasConsumidas()){
                p = persona;
            }
        }
        return p;
    }

    public Persona menorCalorias(){
        Persona p = null;

        for(Persona persona : personas){
            if(p == null || persona.calcularCaloriasConsumidas() < p.calcularCaloriasConsumidas()){
                p = persona;
            }
        }
        return p;
    }

    public double promedioCaloriasFamilia(){
        double cantTotal = 0;
        double caloriasTotal = 0;

        for(Persona persona : personas){
            caloriasTotal += persona.calcularCaloriasConsumidas();
            cantTotal += persona.cantComida();
        }

        return caloriasTotal / cantTotal;
    }

    
}
