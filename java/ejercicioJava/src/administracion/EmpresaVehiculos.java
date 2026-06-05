package administracion;

import Transporte.Camionetas;
import Transporte.Coche;
import Transporte.Vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaVehiculos {
    private ArrayList<Vehiculos> vehiculos;

    public EmpresaVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public boolean patenteExiste(String patente){
        for(Vehiculos v : vehiculos){
            if(patente.equals(v.getPatente())){
                return true;
            }
        }
        return false;
    }

    public void agregarVehiculo(Vehiculos v){
        String patente = v.getPatente();

        if(!(patente != null && patenteExiste(patente))){
            vehiculos.add(v);
        }
    }

    public String cantMayor(){
        int cantCo = 0;
        int cantB = 0;
        int cantC = 0;


        for(Vehiculos v : vehiculos){
            String tipo = v.getClass().getSimpleName();

            if(tipo.equals("Coche")) cantCo ++;
            if(tipo.equals("Bicicleta")) cantB ++;
            if(tipo.equals("Camionetas")) cantC ++;
        }

    if(cantCo > cantB && cantCo > cantC) return "Autos";
    if(cantC > cantB && cantC > cantCo) return "Camionetas";
    if(cantB > cantC && cantB > cantCo) return "Bicicletas";

    return "Empate";
    }

    public double porcentajeDescapo(){
        double cantCo = 0;
        double cantDesca = 0;

        for(Vehiculos v : vehiculos){
            String tipo = v.getClass().getSimpleName();

            if(tipo.equals("Coche")) cantCo++;
            if(tipo.equals("Coche") && ((Coche) v).isDescapotado()) cantDesca++;
        }

        return (cantDesca*100)/ cantCo;
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("hoa", "hola", Vehiculos.Color.AMARILLO, 4, LocalDate.of(1999, 2, 2), 20, "xlr8", true);
        Coche c2 = new Coche("ho1a", "hol2a", Vehiculos.Color.AMARILLO, 4, LocalDate.of(19299, 2, 2), 220, "22xlr8", true);
        Coche c3 = new Coche("hoa", "hola", Vehiculos.Color.AMARILLO, 4, LocalDate.of(1929, 2, 2), 25, "x8", false);
        Camionetas ca1 = new Camionetas("fa", "35d", Vehiculos.Color.AMARILLO , 5, LocalDate.of(2000, 12, 27), 53, "ojsdf", 100, 1000);
        ArrayList<Vehiculos> a1 = new ArrayList<>();
        EmpresaVehiculos ev1 = new EmpresaVehiculos(a1);

        ev1.agregarVehiculo(c1);
        ev1.agregarVehiculo(c2);
        ev1.agregarVehiculo(c3);
        ev1.agregarVehiculo(ca1);

        System.out.println(ca1.getCantActual());
        ca1.agregarCarga(100);
        System.out.println(ca1.getCantActual());

        System.out.println(ev1.cantMayor());
        System.out.println(ev1.porcentajeDescapo());
    }
}

