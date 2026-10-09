package administracion.cosasPrestadas;

public class Pantalon extends Prenda{
    private int medidaCintura;
    private int medidaCadera;
    private int medidaLargo;

    public Pantalon(String color, String material, String marca, String estado, int medidaCintura, int medidaCadera, int medidaLargo) {
        super(color, material, marca, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.medidaLargo = medidaLargo;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public int getMedidaLargo() {
        return medidaLargo;
    }

    public void setMedidaLargo(int medidaLargo) {
        this.medidaLargo = medidaLargo;
    }
}
