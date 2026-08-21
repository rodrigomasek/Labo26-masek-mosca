package Sistema1;

class BebidaAlcoholica extends Bebida {
    private double cantidadAlcohol;

    public BebidaAlcoholica(String nombre, double cantidadAlcohol) {
        super(nombre, 0, cantidadAlcohol * 20);
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public double getCantidadAlcohol() {
        return cantidadAlcohol;
    }
}