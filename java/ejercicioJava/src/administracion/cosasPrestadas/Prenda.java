package administracion.cosasPrestadas;

public abstract class Prenda {
    private String color;
    private String material;
    private String marca;
    private String estado;

    public Prenda(String color, String material, String marca, String estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return "prenda";
    }
}
