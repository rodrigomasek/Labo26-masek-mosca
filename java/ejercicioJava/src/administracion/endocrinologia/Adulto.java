package administracion.endocrinologia;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero) {
        super(nombre, apellido, fechaNacimiento, genero);
    }
}
