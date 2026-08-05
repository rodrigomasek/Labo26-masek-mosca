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

    public Dron(String nombreModelo, LocalDate fAdquirido, double bateria, int id, Estado estado, Mision mision) {
        this.nombreModelo = nombreModelo;
        this.fAdquirido = fAdquirido;
        this.bateria = bateria;
        this.id = id;
        this.estado = estado;
        this.mision = mision;
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

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public abstract boolean hacerMision();
    public double rastrearDron()
    {
        if(this.estado.equals(Estado.EN_VUELO) || this.estado.equals(Estado.EN_OPERATIVO))
        {
            return 1;
        }
        return -1;
    }
}
