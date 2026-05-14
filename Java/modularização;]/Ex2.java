package Modularizacao;

import java.util.Scanner;

public class Ex2 {

    public static void mostrarQuadrado(int numero) {
        System.out.println("Quadrado: " + (numero * numero));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um número: ");
        int n = sc.nextInt();

        mostrarQuadrado(n);
    }
}