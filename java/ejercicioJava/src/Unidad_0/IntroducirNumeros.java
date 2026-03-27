package Unidad_0;

import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        int cant = 0;
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Poneme el    NUMERO!!!    que quieras excepto -1: ");
        num = scanner.nextInt();

         while(num != -1)
         {
             num = scanner.nextInt();
             cant++;
         }
        System.out.println(cant);
    }
}
