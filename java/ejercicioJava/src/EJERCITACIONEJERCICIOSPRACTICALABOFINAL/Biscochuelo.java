package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

import Lugares.tienda_electronica.Producto;
import enums.Categoria_Electronica;

public class Biscochuelo extends Preparacion {
    private float limon;
    private float polvoHornear;

    public Biscochuelo(float harina, float azucar, float manteca, int huevos, double pUnitario, int stockHecho, float limon, float polvoHornear) {
        super(harina, azucar, manteca, huevos, pUnitario, stockHecho);
        this.limon = limon;
        this.polvoHornear = polvoHornear;
    }

    public float getLimon() {
        return limon;
    }

    public void setLimon(float limon) {
        this.limon = limon;
    }

    public float getPolvoHornear() {
        return polvoHornear;
    }

    public void setPolvoHornear(float polvoHornear) {
        this.polvoHornear = polvoHornear;
    }

    @Override
    public void conocerReceta() {
        System.out.println("El biscochuelo arranca con...");
    }
}
