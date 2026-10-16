import enums.ColorDianas;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private static float radio = 13;

    public DianaCircular(String nombre, int nivelDificultad, HashMap<Integer, ColorDianas> puntajeColor) {
        super(nombre, nivelDificultad, puntajeColor);
    }

    public static float getRadio() {
        return radio;
    }

    public static void setRadio(float radio) {
        DianaCircular.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679 * (DianaCircular.radio * DianaCircular.radio);
    }
}
