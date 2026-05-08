package Exercicios_If_else_Switch;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        // Solicitar temperatura
        System.out.print("Introduza a temperatura: ");
        double temperatura = scanner.nextDouble();

        double resultado;

        // Estrutura switch-case
        switch (opcao) {
            case 1:
                resultado = (temperatura * 1.8) + 32;
                System.out.println("Temperatura em Fahrenheit: " + resultado + " °F");
                break;

            case 2:
                resultado = (temperatura - 32) / 1.8;
                System.out.println("Temperatura em Celsius: " + resultado + " °C");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}