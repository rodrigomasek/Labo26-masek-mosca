package administracion.SistemaAsistencia;

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
    public float asistenciaMensual()
    {

    }
    public float asistenciaAnual()
    {
        
    }

}
