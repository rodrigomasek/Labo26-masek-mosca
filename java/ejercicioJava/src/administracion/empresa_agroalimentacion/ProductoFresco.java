package administracion.empresa_agroalimentacion;

import enums.PaisOrigen;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
    public ProductoFresco(LocalDate fechaVencimiento, int numeroLote, String nombre, String codigo, PaisOrigen paisOrigen, LocalDate fechaEnvasado) {
        super(fechaVencimiento, numeroLote, nombre, codigo, paisOrigen, fechaEnvasado);
    }
    public ProductoFresco() {
        super(LocalDate.now(), 10, "juan", "n166A", PaisOrigen.ARGENTINA, LocalDate.now());
    }

    @Override
    public String infoNutricional(){
        return super.infoNutricional()
        + " | vitamina b12 = 41";
    }
}
