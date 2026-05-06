package organizaciones;

import Transporte.Vehiculos;

import java.util.ArrayList;

public class EmpresaVehiculos {
    private ArrayList<Vehiculos> vehiculos;

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


}
