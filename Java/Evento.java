package Exercicios_If_else_Switch;

import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade
        System.out.print("Introduza a sua idade: ");
        int idade = scanner.nextInt();

        // Verificar condições
        if (idade < 18) {
            System.out.println("Acesso ao evento não permitido.");
        } else if (idade > 60) {
            System.out.println("Bem-vindo ao evento!");
            System.out.println("Tem direito a desconto especial.");
        } else {
            System.out.println("Bem-vindo ao evento!");
        }

        scanner.close();
    }
}