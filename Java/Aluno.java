package exercicios_lista_1;import java.util.Scanner;

public class Aluno {

    // Atributos
    String nome;
    double nota1;
    double nota2;

    // Método para calcular média
    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para imprimir resultado
    void imprimirResultado() {

        double media = calcularMedia();

        System.out.println("\n----- RESULTADO DO ALUNO -----");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        if (media >= 10) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    // Método principal
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criando objeto
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = entrada.nextDouble();

        // Mostrar resultado
        aluno.imprimirResultado();

        entrada.close();
    }
}