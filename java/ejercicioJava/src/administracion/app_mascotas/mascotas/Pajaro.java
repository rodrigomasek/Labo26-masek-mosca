package administracion.app_mascotas.mascotas;

public class Pajaro extends Mascota{
    private boolean cantor;

    public Pajaro(String nombre, String dueño, boolean cantor) {
        super(nombre, dueño);
        this.cantor = cantor;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    @Override
    public String saludo(){
        if(cantor){
            return "iop";
        }
        return "pio";
    }
}
