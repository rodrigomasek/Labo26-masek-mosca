import java.util.Scanner;

public class IntroducirNumeros2 {
    public static void main(String[] args) {
        int cant = 0;
        int num;
        int may = 0;
        int men = 0;
        int sumT = 0;
        int sumP = 0;
        int sumN = 0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Poneme el número que quieras excepto -1: ");
        num = scanner.nextInt();

        while(num != -1)
        {
            if(num < 0)
            {
                sumN += num;
            }
            else if(num > 0)
            {
                sumP += num;
            }
            sumT += num;
            num = scanner.nextInt();
            cant++;



        }
        System.out.println(cant);
    }
}
