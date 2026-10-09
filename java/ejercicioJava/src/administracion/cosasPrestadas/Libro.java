package administracion.cosasPrestadas;

import java.time.LocalDate;

public class Libro extends Texto{
    private int cantPagCapitulo;

    public Libro(String codigo, String titulo, LocalDate añoPublicacion, int cantPagCapitulo) {
        super(codigo, titulo, añoPublicacion);
        this.cantPagCapitulo = cantPagCapitulo;
    }

    public int getCantPagCapitulo() {
        return cantPagCapitulo;
    }

    public void setCantPagCapitulo(int cantPagCapitulo) {
        this.cantPagCapitulo = cantPagCapitulo;
    }
}
