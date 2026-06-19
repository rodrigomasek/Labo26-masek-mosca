package Objetos.Sensores;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Sensor {
    private boolean estado;
    private double medida;
    private double umbral;
    private LocalDate fechaAdquirido;

    public Sensor(LocalDate fechaAdquirido, double umbral, double medida, boolean estado) {
        this.fechaAdquirido = fechaAdquirido;
        this.umbral = umbral;
        this.medida = medida;
        this.estado = estado;
    }

    public LocalDate getFechaAdquirido() {
        return fechaAdquirido;
    }

    public void setFechaAdquirido(LocalDate fechaAdquirido) {
        this.fechaAdquirido = fechaAdquirido;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void superoUmbral() {
        if(this.medida > this.umbral && this.estaConectado())
        {
            activarAlarma();
        }
    }
    public abstract void activarAlarma();

    public boolean estaConectado()
    {
        return isEstado();
    }
    public static void main(String[] args) {

        SensorHumo humo = new SensorHumo(LocalDate.now(), 50, 80, true);
        SensorTemperatura temperatura = new SensorTemperatura(LocalDate.now(), 30, 35, true);
        SensorPresion presion = new SensorPresion(LocalDate.now(), 100, 90, true);

        ArrayList<Sensor> lista = new ArrayList<>();
        lista.add(humo);
        lista.add(temperatura);
        lista.add(presion);

        GrupoSensor grupo = new GrupoSensor(lista);

        System.out.println("=== Lectura individual ===");
        grupo.leerSensores();

        System.out.println("\nPromedio: " + grupo.sacarPromedio());

        System.out.println("\n=== Alarma grupal ===");
        grupo.decidirActivarAlarma();

    }
}

