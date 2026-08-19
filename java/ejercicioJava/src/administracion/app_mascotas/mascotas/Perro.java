package administracion.app_mascotas.mascotas;

public class Perro extends Mascota{
    public Perro(String nombre, String dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludo(){
        return "guau";
    }
}
