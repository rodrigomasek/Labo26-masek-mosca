package Transporte;

import java.time.LocalDate;

public class Vehiculos {
    private String marca;
    private String modelo;
    private String color;
    private int cantRuedas;
    private LocalDate fFabricacion;
    private double velocidad;
    private String patente;

    public Vehiculos(String marca, String modelo, String color, int cantRuedas, LocalDate fFabricacion, double velocidad, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.fFabricacion = fFabricacion;
        this.velocidad = velocidad;
        this.patente = patente;
    }

    public Vehiculos(String marca, String modelo, String color, int cantRuedas, LocalDate fFabricacion, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.fFabricacion = fFabricacion;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public LocalDate getfFabricacion() {
        return fFabricacion;
    }

    public void setfFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
