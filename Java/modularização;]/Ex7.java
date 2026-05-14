package Modularizacao;

import java.util.Scanner;

public class Ex7 {

    static Scanner sc = new Scanner(System.in);

    public static float validarAltura() {
        float h;

        do {
            System.out.print("Altura: ");
            h = sc.nextFloat();
        } while (h <= 0 || h > 2.5);

        return h;
    }

    public static void contarAlturas(float[] alturas) {
        int baixo = 0, medio = 0, alto = 0;

        for (float h : alturas) {
            if (h < 1.55) baixo++;
            else if (h <= 1.75) medio++;
            else alto++;
        }

        System.out.println("Baixos: " + baixo);
        System.out.println("Médios: " + medio);
        System.out.println("Altos: " + alto);
    }

    public static void main(String[] args) {

        System.out.print("Quantidade de alunos: ");
        int n = sc.nextInt();

        float[] alturas = new float[n];

        for (int i = 0; i < n; i++) {
            alturas[i] = validarAltura();
        }

        contarAlturas(alturas);
    }
}