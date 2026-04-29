package Transporte;

import java.time.LocalDate;

public class Coche extends Vehiculos{
    private String patente;
    private boolean descapotado;

    public Coche(String marca, String modelo, String color, int cantRuedas, LocalDate fFabricacion, double velocidad, String patente, boolean descapotado) {
        super(marca, modelo, color, cantRuedas, fFabricacion, velocidad);

        this.patente = patente;
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
