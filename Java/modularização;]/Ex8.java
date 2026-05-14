package Modularizacao;

import java.util.Scanner;

public class Ex8 {

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

    // menu
    public static void menu() {

        int opcao = 0;
        int n = 0;
        float[] alturas = null;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserir quantidade de alunos");
            System.out.println("2. Introduzir alturas e classificar");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quantidade: ");
                    n = sc.nextInt();
                    alturas = new float[n];
                    break;

                case 2:
                    if (alturas == null) {
                        System.out.println("Primeiro insira a quantidade!");
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        alturas[i] = validarAltura();
                    }

                    contarAlturas(alturas);
                    break;

                case 3:
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
    }

    public static void main(String[] args) {
        menu();
    }
}