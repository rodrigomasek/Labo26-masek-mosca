package administracion.endocrinologia;

public interface Tratamiento {
    boolean puedeIniciarTratamiento();
    String iniciarTratamiento();
    int costoTratamiento();
    Genero sangreEsperada();
}
