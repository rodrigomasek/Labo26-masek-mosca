package administracion.sistemaBars;

import java.util.ArrayList;
import java.util.HashSet;

public class Bar {
    private ArrayList<Diana> dianas;
    private int cantClientes;
    private double dineroRecaudado;
    private HashSet<Beneficio> beneficios;
    private HashSet<BeneficioAcumulable> beneficiosAcumulables;

    public Bar(ArrayList<Diana> dianas, int cantClientes, double dineroRecaudado, HashSet<Beneficio> beneficios, HashSet<BeneficioAcumulable> beneficiosAcumulables) {
        this.dianas = dianas;
        this.cantClientes = cantClientes;
        this.dineroRecaudado = dineroRecaudado;
        this.beneficios = beneficios;
        this.beneficiosAcumulables = beneficiosAcumulables;
    }

    public ArrayList<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(ArrayList<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<BeneficioAcumulable> getBeneficiosAcumulables() {
        return beneficiosAcumulables;
    }

    public void setBeneficiosAcumulables(HashSet<BeneficioAcumulable> beneficiosAcumulables) {
        this.beneficiosAcumulables = beneficiosAcumulables;
    }

    public int cantBeneficiosTragos()
    {
        int cant = 0;
        for (Beneficio b : this.beneficios)
        {
            if(b instanceof BeneficioTragos)
            {
                cant++;
            }
        }
        return cant;
    }
}
