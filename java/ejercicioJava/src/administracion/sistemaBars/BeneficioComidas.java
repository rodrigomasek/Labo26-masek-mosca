package administracion.sistemaBars;

import java.util.HashSet;

public class BeneficioComidas extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> comidas;

    public BeneficioComidas(String nombre, String creador, HashSet<String> comidas) {
        super(nombre, creador);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int calcularDescuentoExtra() {
        return 4500;
    }
}
