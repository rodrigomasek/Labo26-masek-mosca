package enums;

public enum NivelConservacion {

    N1(1), N2(2), N3(3), N4(4), N5(5),
    N6(6), N7(7), N8(8), N9(9), N10(10);

    private final int valor;

    NivelConservacion(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public NivelConservacion subir() {
        if (this.ordinal() < values().length - 1) {
            return values()[this.ordinal() + 1];
        }
        return this;
    }

    public NivelConservacion bajar() {
        if (this.ordinal() > 0) {
            return values()[this.ordinal() - 1];
        }
        return this;
    }
}
