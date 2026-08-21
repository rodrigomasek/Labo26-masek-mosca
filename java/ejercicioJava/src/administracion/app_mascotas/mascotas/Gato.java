package administracion.app_mascotas.mascotas;

public class Gato extends Mascota{
    public Gato(String nombre, String dueño, int alegria) {
        super(nombre, dueño, alegria);
    }

    @Override
    public String saludo(){
        return "miau";
    }

    @Override
    public String tipo(){
        return "Gato";
    }
}
