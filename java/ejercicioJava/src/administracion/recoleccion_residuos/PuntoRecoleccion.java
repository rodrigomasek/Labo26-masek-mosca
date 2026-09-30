package administracion.recoleccion_residuos;

import administracion.recoleccion_residuos.RecepcionResiduo;
import administracion.recoleccion_residuos.Residuo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PuntoRecoleccion {
    private String direccion;
    private double latitud;
    private double longitud;
    private String barrio;
    private String nombre;

    private HashSet<RecepcionResiduo> residuos;

    public PuntoRecoleccion(String direccion, double latitud, double longitud, String barrio, String nombre) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.barrio = barrio;
        this.nombre = nombre;
        this.residuos = new HashSet<>();
    }

    public void agregarResiduo(Residuo residuo, double cantidad) {
        residuos.add(new RecepcionResiduo(residuo, cantidad));
    }

    public void quitarResiduo(Residuo residuo) {

    }

    public HashSet<RecepcionResiduo> consultarResiduos() {
        return residuos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBarrio() {
        return barrio;
    }
}
