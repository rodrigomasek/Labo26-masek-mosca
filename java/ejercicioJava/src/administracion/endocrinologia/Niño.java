package administracion.endocrinologia;

import java.time.LocalDate;

public class Niño extends Paciente implements Tratamiento{
    private int nivelTolerancia;

    public Niño(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, int nivelTolerancia) {
        super(nombre, apellido, fechaNacimiento, genero);

        if(nivelTolerancia >= 1 && nivelTolerancia <= 10){
            this.nivelTolerancia = nivelTolerancia;
        }
    }

    @Override
    public boolean puedeIniciarTratamiento(){
        return edad() > 3;
    }

    @Override
    public String iniciarTratamiento(){
        if(puedeIniciarTratamiento()){
            return "Tu tratamiento tardará esta cantidad de días: " + nivelTolerancia * 2;
        }
        return "aun es chico para el tratamiento";
    }

    @Override
    public int costoTratamiento(){
        return nivelTolerancia * 450000;
    }

    @Override
    public Genero sangreEsperada(){
        return Genero.AB_POSITIVO;
    }
}
