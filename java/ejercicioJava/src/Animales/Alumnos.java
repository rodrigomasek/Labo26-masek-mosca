package Animales;

import Escuela.Materia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumnos {
    private String nombre;
    private String apellido;
    private LocalDate fechaN;
    private ArrayList<Integer> notas;
    private ArrayList<Materia> materias;


    public Alumnos(String nombre, String apellido, LocalDate fechaN, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.notas = notas;
    }
        public Alumnos() {
        this.nombre = "messi";
        this.apellido = "lionel";
        this.fechaN = LocalDate.of(1986, 6, 7);
        this.notas = new ArrayList<>();
        this.materias = new ArrayList<>();
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

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int menor(){
        //no se hacer la validacion
        int valor = getNotas().get(1);
        for(int n : notas){
            if(n < valor){
                valor = n;
            }
        }

        return valor;
    }

    public int mayor(){
        //no se hacer la validacion
        int valor = getNotas().get(1);

        for(int n : notas){
            if(n > valor){
                valor = n;
            }
        }

        return valor;
    }

    public void agregarN(int n){
        this.notas.add(n);

    }
    public void agregarM(Materia materia)
    {
        this.materias.add(materia);
    }

    public float promedioN()
    {
        float sum = 0;
        float cant = 0;
        int i = 0;
        for(int n : notas)
        {
            sum += notas.get(i);
            cant++;
        }
        return (sum/cant);
    }


    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        LocalDate f1 = LocalDate.of(1000,6,7);
        Alumnos a1 = new Alumnos("juan", ":V",  f1, n1);

        a1.agregarN(342);
        a1.agregarN(3);

        System.out.println("minimo: " + a1.menor());
        System.out.println("mayor: " + a1.mayor());
        Materia m1 = new Materia();
    }
}
