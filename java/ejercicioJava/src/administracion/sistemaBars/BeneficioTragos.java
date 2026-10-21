package administracion.sistemaBars;

import java.util.HashSet;

public class BeneficioTragos extends Beneficio{
    private HashSet<String> tragos;

    public BeneficioTragos(String nombre, String creador, HashSet<String> tragos) {
        super(nombre, creador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
