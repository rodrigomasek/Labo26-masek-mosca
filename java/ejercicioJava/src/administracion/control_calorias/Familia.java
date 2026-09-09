package administracion.control_calorias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

    public void agregarPersona(Persona p){
        personas.add(p);
    }

    public void eliminarPersona(Persona p){
        personas.remove(p);
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
        double caloriasTotal = 0;

        for(Persona persona : personas){
            caloriasTotal += persona.calcularCaloriasConsumidas();
        }

        return caloriasTotal / personas.size();
    }

    public HashSet<Persona> xPlatoComido(Plato plato){
        HashSet<Persona> personasComieronPlato = new HashSet<>();

        for(Persona p : personas){
            if(p.getPlatosComidos().containsKey(plato)){
                personasComieronPlato.add(p);
            }
        }

        return personasComieronPlato;
    }

   public HashSet<Plato> platosDistintos(){
        HashSet<Plato> listaPlatos = new HashSet<>();

        for(Persona persona : personas){
            for(Plato plato : persona.getPlatosComidos().keySet()){
                listaPlatos.add(plato);
            }
        }

        return listaPlatos;
   }

   public HashMap<Persona, Plato> platoFavoritoXPersona(){
        HashMap<Persona, Plato> personaXPlato = new HashMap<>();

       for(Persona persona : personas){
           Plato plato2 = null;
           int cant2 = 0;

           for(Map.Entry<Plato, Integer> map : persona.getPlatosComidos().entrySet()){
                Plato plato = map.getKey();
                int cant = map.getValue();

                if(cant > cant2){
                    plato2 = plato;
                    cant2 = cant;
                }
           }

           personaXPlato.put(persona, plato2);
       }

       return personaXPlato;
   }

    public static void main(String[] args) {

        HashSet<String> ingredientes = new HashSet<>();
        ingredientes.add("Carne");

        Plato carne = new Plato("Carne", ingredientes, 500);
        Plato pizza = new Plato("Pizza", ingredientes, 800);

        Persona juan = new Persona("Juan",
                LocalDate.of(2008, 5, 10), new HashMap<>());

        Persona pedro = new Persona("Pedro",
                LocalDate.of(2007, 3, 20), new HashMap<>());

        HashSet<Persona> personas = new HashSet<>();
        personas.add(juan);
        personas.add(pedro);

        Familia familia = new Familia(personas);

        juan.consumirPlato(carne);
        juan.consumirPlato(carne);
        juan.consumirPlato(pizza);

        pedro.consumirPlato(pizza);

        System.out.println("Calorias Juan: " +
                juan.calcularCaloriasConsumidas());

        System.out.println("Calorias Pedro: " +
                pedro.calcularCaloriasConsumidas());

        System.out.println("Mayor: " +
                familia.mayorCalorias().getNombre());

        System.out.println("Menor: " +
                familia.menorCalorias().getNombre());

        System.out.println("Promedio: " +
                familia.promedioCaloriasFamilia());

        System.out.println("Comieron pizza: " +
                familia.xPlatoComido(pizza).size());

        System.out.println("Platos distintos: " +
                familia.platosDistintos().size());

        System.out.println("Favoritos: " +
                familia.platoFavoritoXPersona());
    }
}
