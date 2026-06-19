package practica1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {
    private LocalDate fCreacion;
    private Platillo platillo;
    private Persona peticionario;
    private LocalDateTime horaEntrega;
    private boolean entregado;

    public Pedido(LocalDate fCreacion, Platillo platillo, Persona peticionario, LocalDateTime horaEntrega, boolean entregado) {
        this.fCreacion = fCreacion;
        this.platillo = platillo;
        this.peticionario = peticionario;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public void setfCreacion(LocalDate fCreacion) {
        this.fCreacion = fCreacion;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    public Persona getPeticionario() {
        return peticionario;
    }

    public void setPeticionario(Persona peticionario) {
        this.peticionario = peticionario;
    }

    public LocalDateTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalDateTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void entregar()
    {
        this.entregado = true;
    }

    public double precioFinal()
    {
        return this.platillo.getPrecio()*(1-this.peticionario.verDescuento()/100);
    }


}
