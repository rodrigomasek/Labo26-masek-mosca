package administracion.endocrinologia;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Tratamiento{
    private HashSet<String> deportes;

    public Joven(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, HashSet<String> deportes) {
        super(nombre, apellido, fechaNacimiento, genero);
        this.deportes = deportes;
    }

    @Override
    public boolean puedeIniciarTratamiento(){
        return !(deportes.size() % 2 == 0) && edad() >= 28;
    }

    @Override
    public String iniciarTratamiento(){
        if(puedeIniciarTratamiento()){
            return "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada";
        }
        return "Será un tratamiento costoso, pero lo vamos a lograr";
    }

    @Override
    public int costoTratamiento(){
        if(getFechaNacimiento().getYear() % 2 == 0){
            return getFechaNacimiento().getDayOfMonth() * 145400;
        }
        return getFechaNacimiento().getMonthValue() * 760000;
    }

    @Override
    public Genero sangreEsperada(){
        return Genero.A_POSITIVO;
    }
}
