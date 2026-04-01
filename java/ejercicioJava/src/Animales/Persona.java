package Animales;

public class Persona {
    private String nombre;
    private int edad;
    private String dir;

    public Persona(String nombre, int edad, String dir)
    {
    this.nombre = nombre;
    this.edad = edad;
    this.dir = dir;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getDir()
    {
        return dir;
    }

    public void setDir(String dir)
    {
        this.dir = dir;
    }

    public void imprimir()
    {
        System.out.println("El nombre es " + nombre);
        System.out.println("La direccion es " + dir);
        System.out.println("La edad es " + edad);
    }

    public static void main(String[] args)
    {
        Persona p1 = new Persona("Messi", 67, "Miami 7600 calle 14 bis");
        p1.imprimir();
    }
}
