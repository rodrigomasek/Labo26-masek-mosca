package Transporte;

import java.time.LocalDate;

public class Coche extends Vehiculos{
    private boolean descapotado;

    public Coche(String marca, String modelo, Color color, int cantRuedas, LocalDate fFabricacion, double velocidad, String patente, boolean descapotado) {
        super(marca, modelo, color, cantRuedas, fFabricacion, velocidad, patente);

        this.descapotado = descapotado;
    }

    public boolean isDescapotado() {
        return descapotado;
    }

    public void setDescapotado(boolean descapotado) {
        this.descapotado = descapotado;
    }

    public String movimiento() {
       String mov;

       if(super.getVelocidad() > 0){
            mov = "acelerando";
       }
       else{
           mov = "quieto";
       }
       return mov;
   }
}
