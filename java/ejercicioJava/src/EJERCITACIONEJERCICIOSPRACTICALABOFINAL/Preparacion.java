package EJERCITACIONEJERCICIOSPRACTICALABOFINAL;

public abstract class Preparacion {
    private float harina;
    private float azucar;
    private float manteca;
    private int huevos;
    private double pUnitario;
    private int stockHecho;

    public Preparacion(float harina, float azucar, float manteca, int huevos, double pUnitario, int stockHecho) {
        this.harina = harina;
        this.azucar = azucar;
        this.manteca = manteca;
        this.huevos = huevos;
        this.pUnitario = pUnitario;
        this.stockHecho = stockHecho;
    }

    public float getHarina() {
        return harina;
    }

    public void setHarina(float harina) {
        this.harina = harina;
    }

    public float getAzucar() {
        return azucar;
    }

    public void setAzucar(float azucar) {
        this.azucar = azucar;
    }

    public float getManteca() {
        return manteca;
    }

    public void setManteca(float manteca) {
        this.manteca = manteca;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public int getStockHecho() {
        return stockHecho;
    }

    public void setStockHecho(int stockHecho) {
        this.stockHecho = stockHecho;
    }

    public abstract void conocerReceta();
}
