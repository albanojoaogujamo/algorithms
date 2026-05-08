package Exercicios_If_else_Switch;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        // Classificação
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}