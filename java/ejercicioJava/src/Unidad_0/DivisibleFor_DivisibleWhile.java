package Unidad_0;

public class DivisibleFor_DivisibleWhile {
    public static void main(String[] args) {
        int num = 100;
        int i;

        for(i = 1; i <= num; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
