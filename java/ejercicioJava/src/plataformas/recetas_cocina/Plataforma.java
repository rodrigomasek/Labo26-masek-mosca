package plataformas.recetas_cocina;

import plataformas.recetas_cocina.platos.Plato;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Plato> platos;

    public Plataforma(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void agregar(Plato p){
        platos.add(p);
    }

    public void eliminar(Plato p){
        platos.remove(p);
    }

    public void modificar(Plato p, Plato p2){
        int index = platos.indexOf(p2);
        platos.set(index, p);
    }
}
