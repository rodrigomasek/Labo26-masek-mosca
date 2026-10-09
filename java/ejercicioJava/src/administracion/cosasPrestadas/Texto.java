package administracion.cosasPrestadas;

import java.time.LocalDate;

public abstract class Texto {
    private String codigo;
    private String titulo;
    private LocalDate añoPublicacion;

    public Texto(String codigo, String titulo, LocalDate añoPublicacion) {  
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(LocalDate añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String toString(){
        return "texto";
    }
}
