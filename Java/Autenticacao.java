package Exercicios_If_else_Switch;

import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {

        String utilizadorCorreto = "admin";
        String senhaCorreta = "1234";

        // Ler dados do utilizador
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o nome de utilizador: ");
        String utilizador = scanner.nextLine();

        System.out.print("Introduza a palavra-passe: ");
        String senha = scanner.nextLine();

        // Verificar credenciais
        if (utilizador.equals(utilizadorCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}