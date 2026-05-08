package Exercicios_If_else_Switch;

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar dados ao utilizador
        System.out.print("Distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Combustível gasto (litros): ");
        double litros = scanner.nextDouble();

        // Calcular consumo médio
        double consumoMedio = distancia / litros;

        // Exibir resultado
        System.out.println("Consumo médio: " + consumoMedio + " km/l");

        scanner.close();
    }
}