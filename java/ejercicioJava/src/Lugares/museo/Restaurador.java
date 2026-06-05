package Lugares.museo;

public class Restaurador {

    public String restaurar(Cuadro cuadro) {

        String antes = "Antes: " + cuadro.getConservacion().getValor();

        int antiguedad = 2026 - cuadro.getAnioCreacion();

        if (antiguedad > 25) {
            cuadro.setConservacion(cuadro.getConservacion().subir());
        } else {
            cuadro.setConservacion(cuadro.getConservacion().subir());
            cuadro.setConservacion(cuadro.getConservacion().subir());
        }

        String despues = "Despues: " + cuadro.getConservacion().getValor();

        return antes + "\n" + despues;
    }
}