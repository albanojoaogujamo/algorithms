package exercicios_lista_1;

import java.util.Scanner;

public class CalculadoraCientifica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("1 - Raiz quadrada");
        System.out.println("2 - Potência");
        System.out.println("3 - Valor absoluto");
        System.out.println("4 - Maior número");

        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

        switch(opcao) {

            case 1:
                System.out.print("Digite um número: ");
                double num = entrada.nextDouble();

                System.out.println(
                    "Raiz quadrada: " + Math.sqrt(num)
                );
                break;

            case 2:
                System.out.print("Digite a base: ");
                double base = entrada.nextDouble();

                System.out.print("Digite o expoente: ");
                double expoente = entrada.nextDouble();

                System.out.println(
                    "Potência: " + Math.pow(base, expoente)
                );
                break;

            case 3:
                System.out.print("Digite um número: ");
                int valor = entrada.nextInt();

                System.out.println(
                    "Valor absoluto: " + Math.abs(valor)
                );
                break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                int a = entrada.nextInt();

                System.out.print("Digite o segundo número: ");
                int b = entrada.nextInt();

                System.out.println(
                    "Maior número: " + Math.max(a, b)
                );
                break;

            default:
                System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}