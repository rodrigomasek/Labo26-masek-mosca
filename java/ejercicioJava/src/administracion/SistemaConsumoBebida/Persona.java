package administracion.SistemaConsumoBebida;

import java.util.ArrayList;

class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Consumo> consumos;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.consumos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void agregarConsumo(Bebida bebida, int cantidad) {
        consumos.add(new Consumo(bebida, cantidad));
    }

    public double calcularCoeficienteHidratacion() {
        double resultado = 0;

        for (Consumo consumo : consumos) {
            resultado += consumo.calcularCoeficiente();
        }

        return resultado;
    }

    public void mostrarConsumos() {
        for (Consumo consumo : consumos) {
            System.out.println(
                    consumo.getCantidad() + " x " + consumo.getBebida().getNombre() + " -> " + consumo.calcularCoeficiente()
            );
        }
    }
}

