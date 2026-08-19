package administracion.app_mascotas.mascotas;

public class Gato extends Mascota{
    public Gato(String nombre, String dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludo(){
        return "miau";
    }
}
