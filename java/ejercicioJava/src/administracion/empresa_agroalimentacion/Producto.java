package administracion.empresa_agroalimentacion;

import enums.PaisOrigen;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numeroLote;
    private String nombre;
    private String codigo;
    private PaisOrigen paisOrigen;
    private LocalDate fechaEnvasado;

    public Producto(LocalDate fechaVencimiento, int numeroLote, String nombre, String codigo, PaisOrigen paisOrigen, LocalDate fechaEnvasado) {
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.nombre = nombre;
        this.codigo = codigo;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String toString(){
        return "codigo: " + codigo
        + " | numero de lote: " + numeroLote;
    }

    public String infoNutricional(){
        return "carbon = 10"
        + " | vitamina c = 3";
    }
}
