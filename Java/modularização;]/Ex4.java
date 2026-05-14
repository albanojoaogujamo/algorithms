package Modularizacao;

public class Ex4 {

    public static void alterarValor() {
        int x = 100;
        System.out.println("Dentro do método: x = " + x);
    }

    public static void main(String[] args) {
        int x = 30;

        System.out.println("Antes: x = " + x);
        alterarValor();
        System.out.println("Depois: x = " + x);

        System.out.println("O valor não muda porque cada método tem o seu próprio escopo.");
    }
}
