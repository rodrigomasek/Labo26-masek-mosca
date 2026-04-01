package Vehiculos;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

   public Coche(String marca, String modelo, String color, double velocidad){
       this.marca = marca;
       this.modelo = modelo;
       this.color = color;
       this.velocidad = velocidad;
   }

   public String getMarca(){
       return marca;
   }
   public String getModelo(){
       return modelo;
   }
   public String getColor(){
       return color;
   }
   public double getVelocidad(){
       return velocidad;
   }

   public void setMarca(String marca){
       this.marca = marca;
   }
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
   public void setColor(String color){
       this.color = color;
   }
   public void setVelocidad(double velocidad){
       this.velocidad = velocidad;
   }

   public String movimiento() {
       String mov;

       if(velocidad > 0){
            mov = "acelerando";
       }
       else{
           mov = "quieto";
       }
       return mov;
   }

    public static void main(String[] args) {
        Coche c1 = new Coche("j1","j2","j3", 43);

        System.out.println(c1.movimiento());
        System.out.println(c1.getVelocidad());
    }
}
