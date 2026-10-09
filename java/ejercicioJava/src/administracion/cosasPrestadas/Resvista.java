package administracion.cosasPrestadas;

import java.time.LocalDate;

public class Resvista extends Texto{
    private LocalDate fechaPublicada;

    public Resvista(String codigo, String titulo, LocalDate añoPublicacion, LocalDate fechaPublicada) {
        super(codigo, titulo, añoPublicacion);
        this.fechaPublicada = fechaPublicada;
    }

    public LocalDate getFechaPublicada() {
        return fechaPublicada;
    }

    public void setFechaPublicada(LocalDate fechaPublicada) {
        this.fechaPublicada = fechaPublicada;
    }
}
