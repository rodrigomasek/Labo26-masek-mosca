package Unidad_0;

public class Vocales {
    public static void main(String[] args) {
        String texto = "Ayer me compre muñecos de la marca ‘ToyCo’ por internet.";
        int i;
        int vocales = 0;

        for(i = 0; texto.length() > i; i++)
        {
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'u' || texto.charAt(i) == 'o' || texto.charAt(i) == 'i' || texto.charAt(i) == 'e')
            {
                vocales++;
            }
        }
        System.out.println(vocales);
    }
}
