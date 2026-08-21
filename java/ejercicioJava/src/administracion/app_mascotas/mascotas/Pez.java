package administracion.app_mascotas.mascotas;

public class Pez extends Mascota{
    private int vida = 10;

    public Pez(String nombre, String dueño, int alegria) {
        super(nombre, dueño, alegria);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String saludo(){
        return "";
    }

    @Override
    public String saludarUsuario(String nombreU, String nombreM){
        if(getNombre().equals(nombreM)){
            if(getDueño().equals(nombreU)){
                setVida(getVida()-1);
                return saludo();
            }
            setVida(0);
            return saludo();
        }
        return "algo salio mal";
    }

    @Override
    public void alimentar(){
        vida++;
    }

    @Override
    public String tipo(){
        return "Pez";
    }

    @Override
    public boolean debeEliminarse(){
        return vida <= 0;
    }
}
