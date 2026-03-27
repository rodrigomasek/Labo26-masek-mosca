package Unidad_0;

import java.util.Scanner;
public class reemplazoLetra {
    public static void main(String[] args) {
        String nuevoTexto;
        String texto = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        char letrita;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Poneme la letra que quieras: ");
        letrita = scanner.nextLine().charAt(0);
        nuevoTexto = texto.replace('e', letrita);
        nuevoTexto = nuevoTexto.replace('é', letrita);
        System.out.println(nuevoTexto);
    }
}
