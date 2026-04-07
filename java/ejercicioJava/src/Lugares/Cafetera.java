package Lugares;

public class Cafetera {
    private int cantidadAct;
    private int cantidadMax;

    public int getCantidadAct(){
        return cantidadAct;
    }

    public void setCantidadAct(int cantidadAct){
        this.cantidadAct = cantidadAct;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public Cafetera(){
        this.cantidadMax = 1000;
        this.cantidadAct = 0;
    }

    public Cafetera(int cantidadMax){
        this.cantidadMax = cantidadMax;
        this.cantidadAct = cantidadMax;
    }

    public Cafetera(int cantidadAct, int cantidadMax){
        this.cantidadMax = cantidadMax;
        this.cantidadAct = cantidadAct;

        if(cantidadAct > cantidadMax){
            this.cantidadAct = cantidadMax;
        }
    }

    public void llenarCafetera(){
        this.cantidadAct = this.cantidadMax;
    }

    public void servirTaza(int capacidad){
        if(this.cantidadAct < capacidad){
            this.cantidadAct = 0;
        }
        else{
            this.cantidadAct = this.cantidadAct - capacidad;
        }
    }

    public void vaciarCafetera(){
        this.cantidadAct = 0;
    }

    public void agregarCafe(int cantidad){
        if((this.cantidadAct + cantidad) > this.cantidadMax){
            this.cantidadAct = this.cantidadMax;
        }
        else{
            this.cantidadAct += cantidad;
        }
    }

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(100);
        Cafetera c3 = new Cafetera(100, 200);

        c1.llenarCafetera();
        c1.servirTaza(10);
        c1.vaciarCafetera();
        c1.agregarCafe(100);

    }
}
