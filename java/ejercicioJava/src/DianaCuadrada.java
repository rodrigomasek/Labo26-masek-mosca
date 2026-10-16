import enums.ColorDianas;

import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private float lado;

    public DianaCuadrada(String nombre, int nivelDificultad, HashMap<Integer, ColorDianas> puntajeColor, float lado) {
        super(nombre, nivelDificultad, puntajeColor);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (this.lado * this.lado);
    }
}
