package Exercicios_If_else_Switch;

import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalCompra;
        double totalPagar;

        // Entrada de dados
        System.out.print("Total da compra: ");
        totalCompra = scanner.nextDouble();

        // Estrutura if-else
        if (totalCompra > 1000) {
            totalPagar = totalCompra - (totalCompra * 0.10);

            System.out.println("Desconto aplicado: 10%");
        } else {
            totalPagar = totalCompra;

            System.out.println("Desconto aplicado: 0%");
        }

        // Saída
        System.out.println("Total a pagar: " + totalPagar);

        scanner.close();
    }
}