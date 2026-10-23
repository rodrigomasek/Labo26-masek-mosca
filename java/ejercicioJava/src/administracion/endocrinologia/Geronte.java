package administracion.endocrinologia;

import java.time.LocalDate;

public class Geronte extends Paciente{
    public Geronte(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero) {
        super(nombre, apellido, fechaNacimiento, genero);
    }
}
