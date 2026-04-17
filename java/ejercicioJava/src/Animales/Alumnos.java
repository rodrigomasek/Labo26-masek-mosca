package Animales;

import Tiempo.Fecha;

import java.util.ArrayList;

public class Alumnos {
    private String nombre;
    private String apellido;
    private Fecha fechaN;
    private ArrayList<Integer> notas;

    public Alumnos(String nombre, String apellido, Fecha fechaN, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public void setFechaN(Fecha fechaN) {
        this.fechaN = fechaN;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int menor(){
        int valor = getNotas().get(1);

        for(int n : notas){
            if(n < valor){
                valor = n;
            }
        }

        return valor;
    }

    public int mayor(){
        int valor = getNotas().get(1);

        for(int n : notas){
            if(n > valor){
                valor = n;
            }
        }

        return valor;
    }

    public void agregar(){
        int n;


    }

    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(2);
        n1.add(3);
        n1.add(67);
        n1.add(-10);

        Fecha f1 = new Fecha(1, 2, 2000);
        Alumnos a1 = new Alumnos("juan", ":V",  f1, n1);

        System.out.println("minimo: " + a1.menor());
        System.out.println("mayor: " + a1.mayor());
    }
}
