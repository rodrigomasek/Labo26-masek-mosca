package Objetos.Sensores;

import java.util.ArrayList;

public class GrupoSensor {
    private double umbral;
    private ArrayList<Sensor> sensores;

    public GrupoSensor(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public void leerSensores()
    {
        for(Sensor s : this.sensores)
        {
            s.superoUmbral();
        }
    }
    public double sacarPromedio()
    {
        double sum = 0;
        int cant = 0;
        for(Sensor s : this.sensores)
        {
            if(s.estaConectado())
            {
                sum += s.getMedida();
                cant++;
            }
        }
        return (sum/cant);
    }
    public void decidirActivarAlarma()
    {
        if(sacarPromedio() > this.umbral)
        {
            activarAlarma();
        }
    }
    public int activarAlarma()
    {
        System.out.println("Alarma de sensor complejo activada");
        return 1;
    }

    public static void main(String[] args) {

    }
}
