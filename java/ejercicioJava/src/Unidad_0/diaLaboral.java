package Unidad_0;

import java.util.Scanner;

public class diaLaboral {
    public static void main(String[] args) {
        String[] dias = {"sabado","domingo"};
        Scanner scanner = new Scanner(System.in);
        String dia;
        System.out.print("Ingrese un dia de la semana xd: ");
        dia = scanner.nextLine();
        dia = dia.toLowerCase();
        if(dia.equals(dias[0]) || dia.equals(dias[1]))
        {
            System.out.println("Dia inhabil");
        }
        else
        {
            System.out.println("Dia habil");
        }
    }
}
