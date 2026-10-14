package administracion.cosasPrestadas;

import java.time.LocalDate;
import java.util.HashMap;

public class Libro extends Texto{
    private HashMap<String, Integer> cantPagCapitulo;

    public Libro(String codigo, String titulo, LocalDate añoPublicacion, HashMap<String, Integer> cantPagCapitulo) {
        super(codigo, titulo, añoPublicacion);
        this.cantPagCapitulo = cantPagCapitulo;
    }

    public HashMap<String, Integer> getCantPagCapitulo() {
        return cantPagCapitulo;
    }

    public void setCantPagCapitulo(HashMap<String, Integer> cantPagCapitulo) {
        this.cantPagCapitulo = cantPagCapitulo;
    }

    public boolean parOimpar(){
        return cantPagCapitulo.size() % 2 != 0;
    }
}
