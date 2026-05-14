package exercicios_lista_1;

import java.util.Scanner;

public class Retangulo {

    // Atributos
    double largura;
    double altura;

    // Método para calcular área
    double calcularArea() {
        return largura * altura;
    }

    // Método para calcular perímetro
    double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para mostrar dados
    void mostrarDados() {
        System.out.println("\n----- DADOS DO RETÂNGULO -----");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criando objeto
        Retangulo r = new Retangulo();

        // Introdução dos valores
        System.out.print("Digite a largura do retângulo: ");
        r.largura = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        r.altura = entrada.nextDouble();

        // Mostrar resultados
        r.mostrarDados();

        entrada.close();
    }
}