package Modularizacao;

import java.util.Scanner;

public class Ex6 {

    static Scanner sc = new Scanner(System.in);

    public static int[] lerArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int corrigirNegativos(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
                count++;
            }
        }
        return count;
    }

    public static void imprimirArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.print("Tamanho do array: ");
        int n = sc.nextInt();

        int[] original = lerArray(n);
        int[] copia = original.clone();

        int substituicoes = corrigirNegativos(original);

        System.out.print("Original: ");
        imprimirArray(copia);

        System.out.print("Corrigido: ");
        imprimirArray(original);

        System.out.println("Substituições: " + substituicoes);
    }
}