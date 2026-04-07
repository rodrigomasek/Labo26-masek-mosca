package Lugares.museo;

public class Cuadro {
    private String titulo;
    private String pintor;
    private int anioCreacion;
    private int conservacion;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getPintor() {
        return pintor;
    }

    public void setPintor(String pintor) {
        this.pintor = pintor;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public int getConservacion() {
        return conservacion;
    }

    public void setConservacion(int conservacion) {
        this.conservacion = conservacion;
    }

    public Cuadro(String titulo, String pintor, int anioCreacion, int conservacion) {
        this.titulo = titulo;
        this.pintor = pintor;
        this.anioCreacion = anioCreacion;
        this.conservacion = conservacion;
    }
}
