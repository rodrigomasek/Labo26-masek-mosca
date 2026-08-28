package administracion.control_personas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaIMC {
    private HashMap<Persona, HashMap<LocalDate, Medicion>> personas;

    public SistemaIMC(HashMap<Persona, HashMap<LocalDate, Medicion>> personas) {
        this.personas = personas;
    }

    public HashMap<Persona, HashMap<LocalDate, Medicion>> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<Persona, HashMap<LocalDate, Medicion>> personas) {
        this.personas = personas;
    }

    public Medicion medicionEnUnaFecha(LocalDate fecha, Persona persona){
        return this.personas.get(persona).get(fecha);
    }

    public double pesoPromedioAnual(Persona persona, LocalDate fecha){
        HashMap<LocalDate, Medicion> medicionesProm = personas.get(persona);
        double prom = 0;
        double cant = 0;

        for(Map.Entry<LocalDate, Medicion> vuelta : medicionesProm.entrySet()){
            LocalDate fecha2 = vuelta.getKey();
            Medicion medicion2 = vuelta.getValue();

            if(fecha2.getYear() == fecha.getYear()){
                prom += medicion2.getKg();
                cant++;
            }
        }
        return prom / cant;
    }
}
