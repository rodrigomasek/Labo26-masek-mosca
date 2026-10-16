import enums.ColorDianas;

import java.util.HashMap;

public class DianaRectangular extends Diana{
    private float base;
    private float altura;

    public DianaRectangular(String nombre, int nivelDificultad, HashMap<Integer, ColorDianas> puntajeColor, float base, float altura) {
        super(nombre, nivelDificultad, puntajeColor);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    }
}
