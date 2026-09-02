package administracion.control_personas;

import java.time.LocalDate;
import java.util.HashMap;
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

    public double pesoOcmPromedioAnual(Persona persona, LocalDate fecha, boolean peso){
        HashMap<LocalDate, Medicion> medicionesProm = personas.get(persona);
        double prom = 0;
        double cant = 0;

        for(Map.Entry<LocalDate, Medicion> vuelta : medicionesProm.entrySet()){
            LocalDate fecha2 = vuelta.getKey();
            Medicion medicion2 = vuelta.getValue();

            if(fecha2.getYear() == fecha.getYear()){
                if (peso) {
                    prom += medicion2.getKg();
                } else {
                    prom += medicion2.getCm();
                }
                cant++;
            }
        }
        return prom / cant;
    }

    public double porcentajeVariacionDosFechas(Persona persona, LocalDate fechaOriginal, LocalDate fechaNueva, boolean peso){
        HashMap<LocalDate, Medicion> medicionProm = personas.get(persona);
        int medicionOriginal = 0;
        int medicionNueva = 0;

        for(Map.Entry<LocalDate, Medicion> vuelta : medicionProm.entrySet()){
            LocalDate fecha3 = vuelta.getKey();
            Medicion medicion = vuelta.getValue();

            if(fecha3.isEqual(fechaOriginal)){
                if(peso){
                    medicionOriginal = medicion.getKg();
                }
                else{
                    medicionOriginal = medicion.getCm();
                }
            }

            if(fecha3.isEqual(fechaNueva)){
                if(peso){
                    medicionNueva = medicion.getKg();
                }
                else{
                    medicionNueva = medicion.getCm();
                }
            }
        }

        if(medicionNueva == 0){
            System.out.println("no se encontro una nueva medicion");
            return 0;
        }
        else if(medicionOriginal == 0){
            System.out.println("no se encontro la medicion original");
            return 0;
        }

        return Math.abs(((double) (medicionOriginal - medicionNueva) / medicionOriginal) * 100);
    }

    public LocalDate fechaPeso(Persona persona, boolean mayor){
        HashMap<LocalDate, Medicion> medicionProm = personas.get(persona);
        int kg;
        LocalDate fechaDia = null;

        if (mayor) {
            kg = Integer.MIN_VALUE;
        }
        else {
            kg = Integer.MAX_VALUE;
        }

        for(Map.Entry<LocalDate, Medicion> vuelta : medicionProm.entrySet()){
            LocalDate fecha = vuelta.getKey();
            Medicion medicion = vuelta.getValue();
            
            if(mayor){
                if(medicion.getKg() > kg){
                    kg = medicion.getKg();
                    fechaDia = fecha;
                }
            }

            if(!mayor){
                if(medicion.getKg() < kg){
                    kg = medicion.getKg();
                    fechaDia = fecha;
                }
            }
        }
        
        return fechaDia;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Perez",
                LocalDate.of(2000, 5, 10));

        HashMap<LocalDate, Medicion> mediciones = new HashMap<>();

        mediciones.put(LocalDate.of(2026, 1, 10), new Medicion(175, 80));
        mediciones.put(LocalDate.of(2026, 3, 10), new Medicion(176, 75));

        HashMap<Persona, HashMap<LocalDate, Medicion>> personas = new HashMap<>();
        personas.put(p, mediciones);

        SistemaIMC sistema = new SistemaIMC(personas);

        System.out.println(sistema.medicionEnUnaFecha(
                LocalDate.of(2026, 1, 10), p).getKg());

        System.out.println(sistema.pesoOcmPromedioAnual(
                p, LocalDate.of(2026, 1, 1), true));

        System.out.println(sistema.pesoOcmPromedioAnual(
                p, LocalDate.of(2026, 1, 1), false));

        System.out.println(sistema.porcentajeVariacionDosFechas(
                p,
                LocalDate.of(2026, 1, 10),
                LocalDate.of(2026, 3, 10),
                true));

        System.out.println(sistema.fechaPeso(p, true));
        System.out.println(sistema.fechaPeso(p, false));
    }
}
