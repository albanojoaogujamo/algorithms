package Modularizacao;

import java.util.Scanner;

public class Ex3 {

    public static float calcularArea(float base, float altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        float base = sc.nextFloat();

        System.out.print("Altura: ");
        float altura = sc.nextFloat();

        System.out.println("Área: " + calcularArea(base, altura));
    }
}