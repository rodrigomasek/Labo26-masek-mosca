package plataformas.recetas_cocina;

import enums.Dificultad;
import plataformas.recetas_cocina.platos.Plato;
import plataformas.recetas_cocina.platos.PlatoPrincipal;
import plataformas.recetas_cocina.platos.Postre;

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

    public ArrayList<Plato> recetasDificultad(Dificultad dificultad){
        ArrayList<Plato> arr = new ArrayList<>();

        for(Plato p : platos){
            if(p.getDificultad() == dificultad){
                arr.add(p);
            }
        }
        return arr;
    }

    public int recetasTotales(){
        return platos.size();
    }

    public Plato mayorPasos(){
        Plato p1 = platos.get(0);

        for(Plato p : platos){
            if(p.getPasos().size() > p1.getPasos().size()){
                p1 = p;
            }
        }
        return p1;
    }

    public static void main(String[] args) {
        ArrayList<String> pa2 = new ArrayList<>();
        pa2.add("agua");

        PlatoPrincipal pp1 = new PlatoPrincipal("pan", Dificultad.FACIL, pa2, 100, 10);
        PlatoPrincipal pp2 = new PlatoPrincipal("panade", Dificultad.FACIL, pa2, 1020, 10);
        PlatoPrincipal pp3 = new PlatoPrincipal("pana", Dificultad.FACIL, pa2, 1002, 10);

        Postre po1 = new Postre("flan", Dificultad.AVANZADO, pa2, 100, true);
        Postre po2 = new Postre("flana", Dificultad.AVANZADO, pa2, 100, true);
        Postre po3 = new Postre("flanfs", Dificultad.AVANZADO, pa2, 100, true);

        ArrayList<Plato> ar1 = new ArrayList<>();

        Plataforma p1 = new Plataforma(ar1);

        p1.agregar(pp1);
        p1.agregar(pp2);
        p1.agregar(pp3);
        p1.agregar(po1);
        p1.agregar(po2);
        p1.agregar(po3);

        System.out.println(p1.recetasTotales());

        p1.eliminar(pp1);

        System.out.println(p1.recetasTotales());

        p1.modificar(pp2, pp3);

        System.out.println(po1.mostrar());
    }
}
