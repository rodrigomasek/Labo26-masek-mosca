package administracion.club_futbol;

import java.util.HashSet;

public class Club {
    private String nombre;
    private HashSet<PersonaFutbol> futbolPersonas;
    private HashSet<PersonaFutbol> ofertas;

    public Club(String nombre, HashSet<PersonaFutbol> futbolPersonas) {
        this.nombre = nombre;
        this.futbolPersonas = futbolPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<PersonaFutbol> getFutbolPersonas() {
        return futbolPersonas;
    }

    public void setFutbolPersonas(HashSet<PersonaFutbol> futbolPersonas) {
        this.futbolPersonas = futbolPersonas;
    }

    public void agregar(PersonaFutbol pf) throws ContratacionExeption{
        if(pf.fuiContratado(this.nombre)){
            futbolPersonas.add(pf);

            System.out.println(pf.getNombre() + " fue contratado por: " + nombre);
        }
        else {
            throw new ContratacionExeption(pf.getNombre() + " no puede ser contratado por: " + nombre);
        }
    }

    public void renovar(PersonaFutbol pf) throws ContratacionExeption{
        if(futbolPersonas.contains(pf)){
            if(pf.puedeRenovar()){
                System.out.println(pf.getNombre() + " pudo renovar contrato con: " + nombre);
            }
            else {
                throw new ContratacionExeption(pf.getNombre() + " no pudo renovar contrato con: " + nombre);
            }
        }
    }

    public void mostrarPlantel(){
        for(PersonaFutbol pf : futbolPersonas){
            System.out.println(pf.getNombre());
        }
    }
}
