package Objetos;

import Animales.Fabricante;
import interfaces.Mensajero;
import enums.CompañiaTelefonica;

public class TelefonoMovil extends Dispositivo implements Mensajero {
    private String numero;
    private CompañiaTelefonica compañiaTelefonica;
    private float saldo;
    private boolean prendido;

    public TelefonoMovil(String numeroSerie, Fabricante fabricante, String modelo, String numero, CompañiaTelefonica compañiaTelefonica) {
        super(numeroSerie, fabricante, modelo);
        this.numero = numero;
        this.compañiaTelefonica = compañiaTelefonica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public CompañiaTelefonica getCompañiaTelefonica() {
        return compañiaTelefonica;
    }

    public void setCompañiaTelefonica(CompañiaTelefonica compañiaTelefonica) {
        this.compañiaTelefonica = compañiaTelefonica;
    }
    @Override
    public void mensaje()
    {
        if(this.prendido && this.saldo > 0)
        {
            System.out.println("conectado con la antena mas cercana");
            System.out.println("Vota por el partido por un mejor futuro");
        }
    }
}
