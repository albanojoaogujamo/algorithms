/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filabanco;

import java.util.Scanner;
/**
 *
 * @author Albano Gujamo
 */
public class FilaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horaAtual = 8;
        
        while (horaAtual < 15){
            System.out.print("Introduza o nome do cliente: ");
            String nomeCliente = sc.nextLine();
            
            System.out.print("Tem prioridade? s/n: ");
            boolean temPrioridade = sc.nextLine().equalsIgnoreCase("s");
            
            if (temPrioridade){
                System.out.println("Cliente Prioritário - passa à frente da fila");
            }else{
                System.out.println("Cliente normal - entra no fim da fila");
            }
            System.out.print("Déposito, Levantamento ou Atendimento? ");
            String operacao = sc.nextLine();
            System.out.println("A processar: " + operacao + " para " + nomeCliente);
            
            horaAtual++;
        }
        System.out.println("Banco encerrado.");
    }
    
}
