package Unidad_1.Formas_geometricas;
import java.util.Scanner;
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura)
    {
        this.altura = altura;
        this.base = base;
    }
    public double getBase()
    {
        return base;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double obtenerArea(double base, double altura)
    {
        double area = base * altura;
        return area;
    }
    public double obtenerPerimetro(double base, double altura)
    {
        double perimetro = (2*base)+(2*altura);
        return perimetro;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2,8);
        double area;
        double perimetro;
        area = rectangulo1.obtenerArea(rectangulo1.getBase(), rectangulo1.getAltura());
        perimetro = rectangulo1.obtenerPerimetro(rectangulo1.getBase(), rectangulo1.getAltura());
        System.out.println(area);
        System.out.println(perimetro);
    }
}
