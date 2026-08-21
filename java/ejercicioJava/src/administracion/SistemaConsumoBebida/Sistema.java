package administracion.SistemaConsumoBebida;

import java.util.ArrayList;

class Sistema {
    private ArrayList<Persona> personas;
    private ArrayList<Bebida> bebidas;

    public Sistema() {
        personas = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public boolean agregarPersona(Persona persona) {

        if (buscarPersonaPorDni(persona.getDni()) != null) {
            return false;
        }

        personas.add(persona);
        return true;
    }

    public Persona buscarPersonaPorDni(int dni) {

        for (Persona persona : personas) {
            if (persona.getDni() == dni) {
                return persona;
            }
        }

        return null;
    }


    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public Bebida buscarBebida(String nombre) {

        for (Bebida bebida : bebidas) {
            if (bebida.getNombre().equalsIgnoreCase(nombre)) {
                return bebida;
            }
        }

        return null;
    }

    public void mostrarBebidas() {

        if (bebidas.isEmpty()) {
            System.out.println("No hay bebidas cargadas.");
            return;
        }

        for (int i = 0; i < bebidas.size(); i++) {
            Bebida bebida = bebidas.get(i);

            System.out.println(
                    (i + 1) + ". " +
                            bebida.getNombre() +
                            " | Coeficiente: " +
                            bebida.calcularCoeficiente()
            );
        }
    }


    public Persona obtenerMejorCoeficiente() {

        if (personas.isEmpty()) {
            return null;
        }

        Persona mejor = personas.get(0);

        for (Persona persona : personas) {

            if (persona.calcularCoeficienteHidratacion() >
                    mejor.calcularCoeficienteHidratacion()) {

                mejor = persona;
            }
        }

        return mejor;
    }

    public Persona obtenerPeorCoeficiente() {

        if (personas.isEmpty()) {
            return null;
        }

        Persona peor = personas.get(0);

        for (Persona persona : personas) {

            if (persona.calcularCoeficienteHidratacion() <
                    peor.calcularCoeficienteHidratacion()) {

                peor = persona;
            }
        }

        return peor;
    }

    public void mostrarPersonas() {

        if (personas.isEmpty()) {
            System.out.println("No hay personas cargadas.");
            return;
        }

        for (Persona persona : personas) {

            System.out.println(
                    persona.getNombre() + " " +
                            persona.getApellido() +
                            " | DNI: " +
                            persona.getDni() +
                            " | Coeficiente: " +
                            persona.calcularCoeficienteHidratacion()
            );
        }
    }

    public boolean registrarConsumo(int dni, String nombreBebida, int cantidad) {

        Persona persona = buscarPersonaPorDni(dni);
        Bebida bebida = buscarBebida(nombreBebida);

        if (persona == null || bebida == null) {
            return false;
        }

        persona.agregarConsumo(bebida, cantidad);

        return true;
    }
}