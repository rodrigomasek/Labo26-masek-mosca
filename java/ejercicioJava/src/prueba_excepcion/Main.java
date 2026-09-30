package prueba_excepcion;

public class Main {

    public static int obtenerLongitud(String nombre)
            throws NombreNuloException {

        if (nombre == null) {
            throw new NombreNuloException(
                    "El nombre no puede ser null."
            );
        }

        return nombre.length();
    }

    public static void main(String[] args) {

        String nombre = null;

        try {
            int longitud = obtenerLongitud(nombre);
            System.out.println("El largo del nombre es: " + longitud);
        } catch (NombreNuloException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Nombre y apellido: Juan Pérez");
    }
}

