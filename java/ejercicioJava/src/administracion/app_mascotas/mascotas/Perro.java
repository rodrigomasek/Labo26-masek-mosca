package administracion.app_mascotas.mascotas;

public class Perro extends Mascota{
    public Perro(String nombre, String dueño, int alegria) {
        super(nombre, dueño, alegria);
    }

    @Override
    public String saludo(){
        return "guau";
    }

    @Override
    public String tipo(){
        return "Perro";
    }
}
