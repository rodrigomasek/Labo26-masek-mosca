package Unidad_1.Formas_geometricas;

public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    public Circulo() {
        this.radio = 2;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double pi = 3.14159;
        double area;

        area = pi * (radio * radio);

        return area;
    }
    public double calcularPerimetro(){
        double pi = 3.14;
        double perimetro;

        perimetro = 2 * pi * radio;

        return perimetro;
    }

    public static void main(String[] args) {
        double area;
        double perimetro;

        Circulo a1 = new Circulo(5);
        Circulo a2 = new Circulo();

        area = a1.calcularArea();
        perimetro = a1.calcularPerimetro();

        System.out.println(area);
        System.out.println(perimetro);
    }
}