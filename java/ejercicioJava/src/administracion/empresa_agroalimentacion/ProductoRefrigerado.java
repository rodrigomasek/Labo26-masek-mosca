package administracion.empresa_agroalimentacion;

import enums.PaisOrigen;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    private int temperaturaRecomendada;

    public ProductoRefrigerado(LocalDate fechaVencimiento, int numeroLote, String nombre, String codigo, PaisOrigen paisOrigen, LocalDate fechaEnvasado, int temperaturaRecomendada) {
        super(fechaVencimiento, numeroLote, nombre, codigo, paisOrigen, fechaEnvasado);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
}
