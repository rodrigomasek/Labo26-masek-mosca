package Lugares;

public class Televisores extends Multimedia{
    public enum Tecnologia
    {
        ultraHd, 4K, FullHd
    }
    public Televisores(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
}
