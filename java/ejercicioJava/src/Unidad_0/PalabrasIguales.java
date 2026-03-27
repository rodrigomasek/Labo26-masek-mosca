package Unidad_0;

import java.util.Scanner;
public class PalabrasIguales {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra 1: ");
        palabra1 = scanner.nextLine();
        System.out.print("Ingrese la palabra 2: ");
        palabra2 = scanner.nextLine();
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();
        if(palabra1.equals(palabra2)) System.out.println("Son inguales");
        else System.out.println("Son distintos");
    }
}
