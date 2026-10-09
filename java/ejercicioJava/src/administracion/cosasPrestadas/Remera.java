package administracion.cosasPrestadas;

public class Remera extends Prenda{
    private int medidaEspalda;
    private int medidaContorno;
    private int medidaLargoTorso;

    public Remera(String color, String material, String marca, String estado, int medidaEspalda, int medidaContorno, int medidaLargoTorso) {
        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.medidaContorno = medidaContorno;
        this.medidaLargoTorso = medidaLargoTorso;
    }

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public int getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(int medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public int getMedidaLargoTorso() {
        return medidaLargoTorso;
    }

    public void setMedidaLargoTorso(int medidaLargoTorso) {
        this.medidaLargoTorso = medidaLargoTorso;
    }
}
