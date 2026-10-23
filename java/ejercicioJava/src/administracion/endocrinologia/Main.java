
package administracion.endocrinologia;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Fundacion fundacion = new Fundacion(
                new HashSet<Paciente>(),
                new HashMap<Tratamiento, Integer>()
        );

        Niño ninoApto = new Niño(
                "Lucas", "Perez",
                LocalDate.now().minusYears(5),
                Genero.O_POSITIVO, 8
        );

        Niño ninoChico = new Niño(
                "Mateo", "Gomez",
                LocalDate.now().minusYears(2),
                Genero.A_NEGATIVO, 5
        );

        HashSet<String> deportes = new HashSet<>();
        deportes.add("Futbol");
        deportes.add("Natacion");
        deportes.add("Tenis");

        Joven jovenNoApto = new Joven(
                "Sofia", "Lopez",
                LocalDate.now().minusYears(29),
                Genero.B_POSITIVO, deportes
        );

        HashSet<String> deportesPares = new HashSet<>();
        deportesPares.add("Futbol");
        deportesPares.add("Tenis");

        Joven jovenApto = new Joven(
                "Juan", "Diaz",
                LocalDate.now().minusYears(25),
                Genero.A_NEGATIVO, deportesPares
        );

        Adulto adulto = new Adulto(
                "Carlos", "Ruiz",
                LocalDate.now().minusYears(40),
                Genero.AB_POSITIVO
        );

        Geronte geronte = new Geronte(
                "Maria", "Torres",
                LocalDate.now().minusYears(75),
                Genero.O_NEGATIVO
        );

        System.out.println("=== NIÑO APTO ===");
        System.out.println(ninoApto.iniciarTratamiento());
        System.out.println("Costo: $" + ninoApto.costoTratamiento());
        System.out.println("Sangre esperada: " + ninoApto.sangreEsperada());

        System.out.println("\n=== NIÑO CHICO ===");
        System.out.println(ninoChico.iniciarTratamiento());

        System.out.println("\n=== JOVEN NO APTO ===");
        System.out.println(jovenNoApto.iniciarTratamiento());

        System.out.println("\n=== JOVEN APTO ===");
        System.out.println(jovenApto.iniciarTratamiento());
        System.out.println("Costo: $" + jovenApto.costoTratamiento());
        System.out.println("Sangre esperada: " + jovenApto.sangreEsperada());

        // 4. Registrar a todos los pacientes
        fundacion.agregar(ninoApto);
        fundacion.agregar(ninoChico);
        fundacion.agregar(jovenNoApto);
        fundacion.agregar(jovenApto);
        fundacion.agregar(adulto);
        fundacion.agregar(geronte);

        System.out.println("\n=== FUNDACION ===");
        System.out.println("Pacientes registrados: "
                + fundacion.getPacientes().size());

        System.out.println("Pacientes que no aplican al tratamiento: "
                + fundacion.cantPacientesSinTratar());

        System.out.println("\n=== TRATAMIENTOS ===");
        for (Map.Entry<Tratamiento, Integer> entrada
                : fundacion.getPacientesEnTratamiento().entrySet()) {
            System.out.println(
                    entrada.getKey().getClass().getSimpleName()
                            + " - Dias: " + entrada.getValue()
            );
        }

        fundacion.avanzarTratamiento();

        System.out.println("\n=== DESPUES DE AVANZAR UN DIA ===");
        for (Map.Entry<Tratamiento, Integer> entrada
                : fundacion.getPacientesEnTratamiento().entrySet()) {
            System.out.println(
                    entrada.getKey().getClass().getSimpleName()
                            + " - Dias: " + entrada.getValue()
            );
        }
    }
}

