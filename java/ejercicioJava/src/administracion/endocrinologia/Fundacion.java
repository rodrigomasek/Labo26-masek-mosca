package administracion.endocrinologia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Fundacion {
    private HashSet<Paciente> pacientes;
    private HashMap<Tratamiento, Integer> pacientesEnTratamiento;

    public Fundacion(HashSet<Paciente> pacientes, HashMap<Tratamiento, Integer> pacientesEnTratamiento) {
        this.pacientes = pacientes;
        this.pacientesEnTratamiento = pacientesEnTratamiento;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public HashMap<Tratamiento, Integer> getPacientesEnTratamiento() {
        return pacientesEnTratamiento;
    }

    public void setPacientesEnTratamiento(HashMap<Tratamiento, Integer> pacientesEnTratamiento) {
        this.pacientesEnTratamiento = pacientesEnTratamiento;
    }

    public void avanzarTratamiento() {
        for (Map.Entry<Tratamiento, Integer> entrada : pacientesEnTratamiento.entrySet()) {
            entrada.setValue(entrada.getValue() + 1);
        }
    }

    public void agregar(Paciente p){
        pacientes.add(p);

        if(p instanceof Tratamiento){
            if(((Tratamiento) p).puedeIniciarTratamiento()){
                pacientesEnTratamiento.put((Tratamiento) p, 0);
            }
        }
    }

    public int cantPacientesSinTratar(){
        int cant = 0;

        for(Paciente p : pacientes){
            if(!(p instanceof Tratamiento)){
                cant++;
            }
        }

        return cant;
    }
}
