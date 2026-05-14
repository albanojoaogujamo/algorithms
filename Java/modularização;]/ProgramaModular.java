package Modularizacao;

import java.util.Scanner;

public class ProgramaModular {

    static Scanner sc = new Scanner(System.in);

    // 1. Método de saudação
    public static void imprimirSaudacao() {
        System.out.println("Bem-vindo ao mundo da programação modular!");
    }

    // 2. Mostrar quadrado
    public static void mostrarQuadrado(int numero) {
        System.out.println("Quadrado de " + numero + " = " + (numero * numero));
    }

    // 3. Calcular área do triângulo
    public static float calcularArea(float base, float altura) {
        return (base * altura) / 2;
    }

    // 4. Alteração de valor (escopo)
    public static void alterarValor() {
        int x = 100;
        System.out.println("Dentro do método alterarValor, x = " + x);
    }

    // 5. Validar nota entre 0 e 20
    public static float validarNota() {
        float nota;
        do {
            System.out.print("Introduza uma nota (0-20): ");
            nota = sc.nextFloat();
        } while (nota < 0 || nota > 20);

        return nota;
    }

    // 6a. Ler array
    public static int[] lerArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 6b. Corrigir negativos
    public static int corrigirNegativos(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
                count++;
            }
        }
        return count;
    }

    // 6c. Imprimir array
    public static void imprimirArray(int[] arr) {
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    // 7. Validar altura
    public static float validarAltura() {
        float altura;

        do {
            System.out.print("Introduza altura (m): ");
            altura = sc.nextFloat();
        } while (altura <= 0 || altura > 2.5);

        return altura;
    }

    // 7. Classificar alturas
    public static void contarAlturas(float[] alturas) {
        int baixo = 0, medio = 0, alto = 0;

        for (float h : alturas) {
            if (h < 1.55) baixo++;
            else if (h <= 1.75) medio++;
            else alto++;
        }

        visualizarClassificacao(baixo, medio, alto);
    }

    public static void visualizarClassificacao(int baixo, int medio, int alto) {
        System.out.println("Classificação de alturas:");
        System.out.println("Baixos: " + baixo);
        System.out.println("Médios: " + medio);
        System.out.println("Altos: " + alto);
    }

    // 8. Menu principal
    public static void menu() {

        int opcao;
        int qntAlunos = 0;
        float[] alturas = null;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Inserir quantidade de alunos");
            System.out.println("2. Introduzir alturas e visualizar classificação");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quantidade de alunos: ");
                    qntAlunos = sc.nextInt();
                    alturas = new float[qntAlunos];
                    break;

                case 2:
                    if (alturas == null) {
                        System.out.println("Primeiro insira a quantidade de alunos!");
                        break;
                    }

                    for (int i = 0; i < qntAlunos; i++) {
                        alturas[i] = validarAltura();
                    }

                    contarAlturas(alturas);
                    break;

                case 3:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);
    }

    // MAIN
    public static void main(String[] args) {

        // 1
        imprimirSaudacao();

        // 2
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        mostrarQuadrado(num);

        // 3
        System.out.print("Base do triângulo: ");
        float base = sc.nextFloat();
        System.out.print("Altura do triângulo: ");
        float altura = sc.nextFloat();
        System.out.println("Área = " + calcularArea(base, altura));

        // 4 (explicação de escopo)
        int x = 30;
        System.out.println("Antes do método: x = " + x);
        alterarValor();
        System.out.println("Depois do método: x = " + x);
        System.out.println("Comentário: o valor de x não muda fora do método porque é uma variável local (escopo diferente).");

        // 5
        float nota = validarNota();
        System.out.println("Nota válida: " + nota);

        // 6
        System.out.print("Quantos números deseja inserir? ");
        int n = sc.nextInt();

        int[] original = lerArray(n);
        int[] copia = original.clone();

        int substituicoes = corrigirNegativos(original);

        System.out.print("Array original: ");
        imprimirArray(copia);

        System.out.print("Array corrigido: ");
        imprimirArray(original);

        System.out.println("Substituições feitas: " + substituicoes);

        // 8 menu
        menu();
    }
}