package administracion.SistemaAsistencia;

import enums.DiasSemana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<DiasSemana> jornadaJuan = new HashSet<>();
        jornadaJuan.add(DiasSemana.LUNES);
        jornadaJuan.add(DiasSemana.MARTES);
        jornadaJuan.add(DiasSemana.MIERCOLES);
        jornadaJuan.add(DiasSemana.JUEVES);
        jornadaJuan.add(DiasSemana.VIERNES);

        HashSet<DiasSemana> jornadaAna = new HashSet<>();
        jornadaAna.add(DiasSemana.LUNES);
        jornadaAna.add(DiasSemana.MIERCOLES);
        jornadaAna.add(DiasSemana.VIERNES);


        HashSet<LocalDateTime> asistenciaJuan = new HashSet<>();

        asistenciaJuan.add(LocalDateTime.of(2026, 9, 1, 8, 0));
        asistenciaJuan.add(LocalDateTime.of(2026, 9, 2, 8, 0));
        asistenciaJuan.add(LocalDateTime.of(2026, 9, 3, 8, 0));
        asistenciaJuan.add(LocalDateTime.of(2026, 9, 4, 8, 0));


        HashSet<LocalDateTime> asistenciaAna = new HashSet<>();

        asistenciaAna.add(LocalDateTime.of(2026, 9, 1, 8, 0));
        asistenciaAna.add(LocalDateTime.of(2026, 9, 3, 8, 0));



        Empleado juan = new Empleado("Juan", "Perez", "111111111", LocalDate.of(1995, 5, 10), jornadaJuan, asistenciaJuan);
        Empleado ana = new Empleado("Ana", "Gomez", "222222222", LocalDate.of(1998, 8, 20), jornadaAna, asistenciaAna
        );

        HashMap<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(1001, juan);
        empleados.put(1002, ana);
        Empresa empresa = new Empresa(empleados);
        Empleado empleadoBuscado = empresa.buscarEmpleado(1001);
        System.out.println("Empleado buscado:");

        if (empleadoBuscado != null) {
            System.out.println(empleadoBuscado.getNombre() + " " + empleadoBuscado.getApellido());
        }

        int mes = 9;
        int anio = 2026;

        System.out.println("\nDías que deberían trabajar:");

        System.out.println("Juan: " + empresa.diasPorMesQueSeSuponeQueLaburo(juan, mes, anio));

        System.out.println("Ana: " + empresa.diasPorMesQueSeSuponeQueLaburo(ana, mes, anio));

        System.out.println("\nDías que trabajaron:");

        System.out.println("Juan: " + empresa.diasPorMesQueLaburo(juan, mes, anio));

        System.out.println("Ana: " + empresa.diasPorMesQueLaburo(ana, mes, anio));


        System.out.println("\nAsistencia mensual:");

        System.out.println("Juan: " + empresa.asistenciaMensual(juan, mes, anio));

        System.out.println("Ana: " + empresa.asistenciaMensual(ana, mes, anio));

        System.out.println("\nEmpleados con más de 80% de asistencia:");

        empresa.imprimir(empresa.empleadosConMuchasGanasDeLaburar(mes, anio));
    }
}
