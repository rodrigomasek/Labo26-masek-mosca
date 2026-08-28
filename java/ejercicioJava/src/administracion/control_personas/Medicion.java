package administracion.control_personas;

public class Medicion {
    private int cm;
    private int kg;

    public Medicion(int cm, int kg) {
        this.cm = cm;
        this.kg = kg;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
