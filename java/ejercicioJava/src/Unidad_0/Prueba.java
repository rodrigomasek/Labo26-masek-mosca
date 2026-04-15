package Unidad_0;
import Animales.Persona;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<String> nombres  = new ArrayList<>();
        ArrayList<Integer> numeros  = new ArrayList<>();
        ArrayList<Persona> personas  = new ArrayList<>();
        int suma = 0;

        for(String nombre : nombres){
            if(nombre.charAt(0) == 'a'){
                System.out.println(nombre);
            }
        }

        for(int numero : numeros){
            suma += numero;
        }
        System.out.println(suma);

        for(Persona persona : personas){
            if (persona.getEdad() > 30){
                System.out.println(persona.getNombre());
                System.out.println(persona.getEdad());
                System.out.println(persona.getDir());
            }
        }
    }
}
