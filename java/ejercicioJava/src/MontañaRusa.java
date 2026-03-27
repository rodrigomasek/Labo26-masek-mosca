import java.util.Scanner;
public class MontañaRusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float altura;
        float sumaAlturas = 0;
        int cantidadPersonas = 0;
        boolean hayBajoAltura = false;
        float promedio = 0;

        System.out.println("Ingrese las alturas (0 para terminar):");

        altura = scanner.nextFloat();

        while (altura != 0)
        {
            sumaAlturas += altura;
            cantidadPersonas++;

            if (altura < 1.40)
            {
                hayBajoAltura = true;
            }

            altura = scanner.nextFloat();
        }

        if (cantidadPersonas > 0)
        {
            promedio = sumaAlturas / cantidadPersonas;

            System.out.println("Cantidad de personas: " + cantidadPersonas);
            System.out.println("Altura promedio: " + promedio + " metros");

            if (hayBajoAltura)
            {
                System.out.println("ALERTA: Hay personas con menos de 1.40m. Deben ser retiradas por seguridad.");
            }
            else
            {
                System.out.println("Todos cumplen con la altura mínima.");
            }
        }
        else
        {
            System.out.println("No se ingresaron personas.");
        }

        scanner.close();
    }
}
