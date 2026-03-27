import java.util.Scanner;

public class IntroducirNumeros2 {
    public static void main(String[] args) {
        int cant = 0;
        int num = 0;
        int may = 0;
        int men = 0;
        int sumT = 0;
        int sumP = 0;
        int sumN = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Poneme el número que quieras excepto -1: ");
        num = scanner.nextInt();
        men = num;
        while(num != -1)
        {

            if(num > may)
            {
                may = num;
            }
            if(num < men)
            {
                men = num;
            }
            if(num < 0)
            {
                sumN += num;
            }
            else
            {
                sumP += num;
            }
            sumT += num;
            num = scanner.nextInt();
            cant++;


        }
        System.out.println("La cantidad de numeros introducidos es "+ cant);
        System.out.println("El mayor numero introducido es " + may);
        System.out.println("El menor numero introducido es " + men);
        System.out.println("La suma de todos los numeros es " + sumT);
        System.out.println("La suma de todos los numeros positivos es " + sumP);
        System.out.println("La suma de todos los numeros negativos es " + sumN);


    }
}
