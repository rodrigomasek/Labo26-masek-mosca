package administracion.app_mascotas.mascotas;

public class Pajaro extends Mascota{
    private boolean cantor;
    private String canto;

    public Pajaro(String nombre, String dueño, int alegria, boolean cantor, String canto) {
        super(nombre, dueño, alegria);
        this.cantor = cantor;
        this.canto = canto;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }

    @Override
    public String saludo(){
        if(cantor){
            return canto;
        }
        return "pio";
    }

    @Override
    public String saludarUsuario(String nombreU, String nombreM){
        if(getNombre().equals(nombreM)){
            if(getDueño().equals(nombreU)){
                return saludoMejorado().toUpperCase();
            }
            return "";
        }
        return "algo salio mal";
    }

    @Override
    public String tipo(){
        return "Pajaro";
    }
}
