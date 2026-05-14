package Modularizacao;

import java.util.Scanner;

public class Ex5 {

    public static float validarNota() {
        Scanner sc = new Scanner(System.in);
        float nota;

        do {
            System.out.print("Nota (0-20): ");
            nota = sc.nextFloat();
        } while (nota < 0 || nota > 20);

        return nota;
    }

    public static void main(String[] args) {
        float nota = validarNota();
        System.out.println("Nota válida: " + nota);
    }
}