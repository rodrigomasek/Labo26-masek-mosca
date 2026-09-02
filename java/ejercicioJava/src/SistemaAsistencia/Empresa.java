package SistemaAsistencia;

import enums.DiasSemana;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Empresa {
    private HashMap<Integer, Empleado> empleados;

    public Empresa(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashMap<Integer, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empleado buscarEmpleado(int legajo)
    {
        if(empleados.containsKey(legajo))
        {
         for(Map.Entry<Integer, Empleado> entrada : empleados.entrySet())
         {
            if (entrada.getKey().equals(legajo)){return entrada.getValue();}
         }
        }
        return null;
    }
    public int diasPorMesQueSeSuponeQueLaburo(Empleado empleado, int mes, int anio)
    {
        int numDia;
        LocalDate dia;
        int diasQueSeSuponeQueLaburo = 0;
        for (int i = 1; i <= LocalDate.of(anio, mes, 1).lengthOfMonth(); i++)
        {
            dia = LocalDate.of(anio, mes, i);
            numDia = dia.getDayOfWeek().getValue() - 1;
            for (DiasSemana d : empleado.getJornadaSemanal())
            {
                if (d.ordinal() == numDia)
                {
                    diasQueSeSuponeQueLaburo++;
                }
            }
        }
        if (diasQueSeSuponeQueLaburo != 0)
        {
            return diasQueSeSuponeQueLaburo;
        }
        return -1;
    }

    public int diasPorMesQueLaburo(Empleado empleado, int mes, int anio)
    {
        int dias = 0;
        for (LocalDateTime d : empleado.getAsistencia())
        {
            if (d.getMonthValue() == mes && d.getYear() == anio)
            {
                dias++;
            }
        }
        return dias;
    }

    public float asistenciaMensual(Empleado empleado, int mes, int anio)
    {

        if (diasPorMesQueSeSuponeQueLaburo(empleado, mes, anio) == -1)
        {
            System.out.println("Error");
            return -1;
        }
        return (float) (diasPorMesQueLaburo(empleado, mes, anio)) / (diasPorMesQueSeSuponeQueLaburo(empleado,mes,anio));
    }


}
