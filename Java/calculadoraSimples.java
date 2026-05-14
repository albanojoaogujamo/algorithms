package exercicios_lista_1;

import java.util.Scanner;

public class calculadoraSimples {

    // Método para somar
    void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma é: " + resultado);
    }

    // Método para subtrair
    void subtrair(int a, int b) {
        int resultado = a - b;
        System.out.println("A subtração é: " + resultado);
    }

    // Método para multiplicar
    void multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    // Método para divisão
    void divisao(int a, int b) {

        if (b != 0) {
            int resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        calculadoraSimples calc = new calculadoraSimples();

        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        // Chamando os métodos
        calc.somar(a, b);
        calc.subtrair(a, b);
        calc.multiplicar(a, b);
        calc.divisao(a, b);

        entrada.close();
    }
}