package Empresa_llamadas;

import enums.CodigoPais;

public class Empleado extends Persona {
    private String telefono;
    private String provincia;
    private CodigoPais codigoPais;
    private String franjaHoraria;

    public Empleado(String nombre, String apellido, String dni, String pais,
                    String telefono, String provincia, CodigoPais codigoPais, String franjaHoraria) {
        super(nombre, apellido, dni, pais);
        this.telefono = telefono;
        this.provincia = provincia;
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public CodigoPais getCodigoPais() {
        return codigoPais;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public boolean tieneTelefono(String telefono) {
        return this.telefono.equals(telefono);
    }
}
