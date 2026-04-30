package sistemanotas;

import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos alunos tem a tua turma? ");
        int totalAlunos = scan.nextInt();
        scan.nextLine();
        
        System.out.println("A turma tem " + totalAlunos + " alunos.");
        
        int alunosAvaliados = 0;
        
        while (alunosAvaliados < totalAlunos) {
            
            System.out.println("Introduza o nome do aluno: ");
            String nomeAluno = scan.nextLine();
            
            System.out.println("Introduz a nota do primeiro teste: ");
            double nota1 = scan.nextDouble();
            
            System.out.println("Introduz a nota do segundo teste: ");
            double nota2 = scan.nextDouble();
            
            System.out.println("Introduz a nota do terceiro teste: ");
            double nota3 = scan.nextDouble();
            scan.nextLine();
            
            double soma = nota1 + nota2 + nota3;
            double mediaFinal = soma / 3;
            
            if (mediaFinal >= 13.5) {
                System.out.println(nomeAluno + " - Dispensado - Média: " + mediaFinal);
            } else if (mediaFinal >= 9.5) {
                System.out.println(nomeAluno + " - Aprovado ao Exame - Média: " + mediaFinal);
            } else {
                System.out.println(nomeAluno + " - Excluído - Média: " + mediaFinal);
            }
            
            alunosAvaliados = alunosAvaliados + 1;
        }
    }
}
