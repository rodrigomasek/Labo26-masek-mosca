package Empresa_llamadas;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.llamadas = new ArrayList<>();
    }

    //funcionalidades
    public boolean agregarEmpleado(Empleado empleado) {
        if (existeDni(empleado.getDni()) || existeTelefono(empleado.getTelefono())) {
            return false;
        }
        empleados.add(empleado);
        return true;
    }

    public boolean registrarLlamada(Empleado origen, String telefonoDestino, int duracionMinutos) {
        if (origen == null || telefonoDestino == null || duracionMinutos <= 0) {
            return false;
        }

        if (!existeEmpleado(origen)) {
            return false;
        }

        Empleado destino = buscarEmpleadoPorTelefono(telefonoDestino);

        if (destino == null) {
            return false;
        }

        if (origen.tieneMismoDniQue(destino.getDni())) {
            return false;
        }

        Llamada llamada = crearLlamada(origen, destino, duracionMinutos);
        llamadas.add(llamada);
        return true;
    }

    public Llamada crearLlamada(Empleado origen, Empleado destino, int duracionMinutos) {
        if (origen.viveEnElMismoPaisQue(destino)) {
            return new LlamadaLocal(origen, destino, duracionMinutos);
        }

        return new LlamadaInternacional(origen, destino, duracionMinutos);
    }

    public ArrayList<Llamada> obtenerLlamadasDe(Empleado empleado) {
        ArrayList<Llamada> llamadasDelEmpleado = new ArrayList<>();

        for (Llamada llamada : llamadas) {
            if (llamada.fueRealizadaPor(empleado)) {
                llamadasDelEmpleado.add(llamada);
            }
        }
        return llamadasDelEmpleado;
    }

    public void mostrarRankingEmpleadosQueMasTiempoLlamaronAlExterior() {
        ArrayList<Empleado> empleadosRanking = new ArrayList<>();
        ArrayList<Integer> minutosRanking = new ArrayList<>();

        cargarMinutosAlExterior(empleadosRanking, minutosRanking);

        if (empleadosRanking.isEmpty()) {
            System.out.println("No se registraron llamadas al exterior.");
            return;
        }

        ordenarRankingPorMinutosDescendente(empleadosRanking, minutosRanking);
        imprimirRankingExterior(empleadosRanking, minutosRanking);
    }

    public void cargarMinutosAlExterior(ArrayList<Empleado> empleadosRanking,
                                         ArrayList<Integer> minutosRanking) {

        for (Empleado empleado : empleados) {
            int minutos = calcularMinutosAlExteriorDe(empleado);

            if (minutos > 0) {
                empleadosRanking.add(empleado);
                minutosRanking.add(minutos);
            }
        }
    }
    public int calcularMinutosAlExteriorDe(Empleado empleado) {
        int total = 0;

        for (Llamada llamada : llamadas) {

            total = total + llamada.obtenerMinutosAlExteriorDe(empleado);
        }

        return total;
    }

    public void ordenarRankingPorMinutosDescendente(ArrayList<Empleado> empleadosRanking,
                                                     ArrayList<Integer> minutosRanking) {
        //TODO: Teniendo en cuenta los dos arreglos,
        // ordenar desde el empleado que tiene mayor cantidad de minutos
        // al exterior al menor.

        int n = minutosRanking.size();

        for (int i = 0; i < n - 1; i++) {
            for (int i2 = 0; i2 < n - 1 - i; i2++){
                if(minutosRanking.get(i2) < minutosRanking.get(i2 + 1)){

                    Empleado ordenarE = empleadosRanking.get(i2);
                    empleadosRanking.set(i2, empleadosRanking.get(i2 + 1));
                    empleadosRanking.set(i2 + 1, ordenarE);

                    int ordenarM = minutosRanking.get(i2);
                    minutosRanking.set(i2, minutosRanking.get(i2 + 1));
                    minutosRanking.set(i2 + 1, ordenarM);
                }
            }
        }
    }

    private void imprimirRankingExterior(ArrayList<Empleado> empleadosRanking,
                                         ArrayList<Integer> minutosRanking) {

        System.out.println("Ranking de empleados que mas tiempo llamaron al exterior:");

        //TODO: Mostrar el ranking ordenado concatenando el empleado con los minutos

        for(int i = 1; i <= empleadosRanking.size() - 1; i++){
            System.out.println("top: " + i + empleadosRanking.get(i).getNombreCompleto() +" / "+ minutosRanking.get(i));
        }
    }

    //mostrar datos
    public void mostrarLlamadasDe(Empleado empleado) {
       //TODO: Implementar un método que reciba un empleado y muestre
        // todas las llamadas que haya hecho ese empleado. Luego, mostrar el costo total

        double costoTotal = 0;

        System.out.println("Llamadas realizadas por: " + empleado.getNombreCompleto());

        for (Llamada llamada : llamadas) {

            if (llamada.fueRealizadaPor(empleado)) {

                System.out.println(llamada.obtenerDetalle());

                costoTotal += llamada.calcularCosto();
            }
        }

        System.out.println("Costo total: $" + costoTotal);
    }

    public void mostrarTodasLasLlamadas() {
      //TODO: Ver el detalle de todas las llamadas de la empresa por empleado

        for (Empleado empleado : empleados) {

            System.out.println("Empleado: " + empleado.getNombreCompleto());

            for (Llamada llamada : llamadas) {
                if (llamada.fueRealizadaPor(empleado)) {
                    System.out.println(llamada.obtenerDetalle());
                }
            }
        }
    }

    //verificaciones
    public boolean existeEmpleado(Empleado empleado) {
        for (Empleado empleadoActual : empleados) {
            if (empleadoActual.tieneMismoDniQue(empleado.getDni())) {
                return true;
            }
        }

        return false;
    }

    public boolean existeDni(String dni) {
        for (Empleado empleado : empleados) {
            if (empleado.tieneMismoDniQue(dni)) {
                return true;
            }
        }

        return false;
    }

    public boolean existeTelefono(String telefono) {
        return buscarEmpleadoPorTelefono(telefono) != null;
    }

    public Empleado buscarEmpleadoPorTelefono(String telefono) {
        for (Empleado empleado : empleados) {
            if (empleado.tieneTelefono(telefono)) {
                return empleado;
            }
        }

        return null;
    }
}
