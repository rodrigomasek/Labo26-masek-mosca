package Sistema1;

import java.util.ArrayList;

class Sistema {
    private ArrayList<Persona> personas;
    private ArrayList<Bebida> bebidas;

    public Sistema() {
        personas = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    // ---------- PERSONAS ----------

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

    // ---------- BEBIDAS ----------

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

    // ---------- MEJOR Y PEOR ----------

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

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // Bebidas
        Bebida agua = new BebidaNeutra("Agua", 10, 1);
        Bebida gaseosa = new BebidaAzucarada("Gaseosa", 2);
        Bebida cerveza = new BebidaAlcoholica("Cerveza", 5);

        sistema.agregarBebida(agua);
        sistema.agregarBebida(gaseosa);
        sistema.agregarBebida(cerveza);

        // Personas
        Persona juan = new Persona("Juan", "Perez", 123);
        Persona ana = new Persona("Ana", "Gomez", 456);

        sistema.agregarPersona(juan);
        sistema.agregarPersona(ana);

        // Mostrar bebidas
        sistema.mostrarBebidas();

        // Registrar consumos
        sistema.registrarConsumo(123, "Agua", 2);
        sistema.registrarConsumo(123, "Cerveza", 1);
        sistema.registrarConsumo(456, "Gaseosa", 2);

        // Mostrar personas
        sistema.mostrarPersonas();

        // Mejor y peor
        System.out.println(
                "Mejor coeficiente: " +
                        sistema.obtenerMejorCoeficiente().getNombre()
        );

        System.out.println(
                "Peor coeficiente: " +
                        sistema.obtenerPeorCoeficiente().getNombre()
        );
    }

}