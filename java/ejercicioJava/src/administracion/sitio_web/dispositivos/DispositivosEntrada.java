package administracion.sitio_web.dispositivos;

public class DispositivosEntrada extends Dispositivos{
    private String tipo;

    public DispositivosEntrada(int puertosDisponibles, String tipo) {
        super(puertosDisponibles);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
