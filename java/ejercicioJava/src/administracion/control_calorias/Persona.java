package administracion.control_calorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private HashMap<Plato, Integer> platosComidos;

    public Persona(String nombre, LocalDate fechaNacimiento, HashMap<Plato, Integer> platosComidos) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.platosComidos = platosComidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashMap<Plato, Integer> getPlatosComidos() {
        return platosComidos;
    }

    public void setPlatosComidos(HashMap<Plato, Integer> platosComidos) {
        this.platosComidos = platosComidos;
    }

    public int calcularCaloriasConsumidas() {
        int total = 0;

        for (Map.Entry<Plato, Integer> me : platosComidos.entrySet()) {
            Plato plato = me.getKey();
            int cantidad = me.getValue();

            total += plato.getCantCalorias() * cantidad;
        }

        return total;
    }

    public int promCalorias(){
        return calcularCaloriasConsumidas() / cantComida();
    }

    public int cantComida(){
        int cantidadTotal = 0;

        for (int cantidad : platosComidos.values()) {
            cantidadTotal += cantidad;
        }

        return cantidadTotal;
    }
}
