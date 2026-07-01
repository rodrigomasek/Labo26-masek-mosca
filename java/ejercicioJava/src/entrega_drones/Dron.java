package entrega_drones;

import enums.Estado;

import java.time.LocalDate;

public abstract class Dron {
    private static int siguienteId;
    private String nombreModelo;
    private LocalDate fAdquirido;
    private double bateria;
    private int id;
    private Estado estado;
    private Mision mision;

    public Dron(String nombreModelo, LocalDate fAdquirido, double bateria, int id, Estado estado) {
        this.nombreModelo = nombreModelo;
        this.fAdquirido = fAdquirido;
        this.bateria = bateria;
        this.id = id;
        this.estado = estado;
    }

    public static int getSiguienteId() {
        return siguienteId;
    }

    public static void setSiguienteId(int siguienteId) {
        Dron.siguienteId = siguienteId;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public LocalDate getfAdquirido() {
        return fAdquirido;
    }

    public void setfAdquirido(LocalDate fAdquirido) {
        this.fAdquirido = fAdquirido;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void recargarBateria()
    {
        if(this.bateria < 20){this.bateria = 100;}
        else{this.bateria += 10;}
    }

    public abstract boolean hacerMision();
}
