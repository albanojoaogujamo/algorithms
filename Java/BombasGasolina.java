/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bombasgasolina;

import java.util.Scanner;
/**
 *
 * @author Albano Gujamo
 */
public class BombasGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean encerrar = false;
        
        while(!encerrar){
            System.out.print("Introduza o nome do Cliente: ");
            String nomeCliente = scan.nextLine();
        
            System.out.println("Escolha o tipo de combustivel - Gasolina, Diesel ou GPL");
            String tipoCombustivel = scan.nextLine();
            
            double precoPorLitro;
            if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
                precoPorLitro = 83.53;
            }else if(tipoCombustivel.equalsIgnoreCase("Diesel")){
                precoPorLitro = 67.53;
            } else if(tipoCombustivel.equalsIgnoreCase("GPL")){
                precoPorLitro = 78.40;
            }else{
                System.out.println("Tipo de combustivel invalido!");
                continue;
            }
            
            System.out.print("Quantidade de litros: ");
            double quantLitros = scan.nextDouble();
            scan.nextLine();
            
            if (quantLitros <=0){
                System.out.println("Quantidade inválida!");
                continue;
            }
            
            double valorTotal = quantLitros * precoPorLitro;
            System.out.printf("Total a pagar: %.2f MT%n", valorTotal);
            
            System.out.print("Método de pagamento - Dinheiro, Cartão ou Transferência: ");
            String metodoPagamento = scan.nextLine();
            
            System.out.print("Confirmas o pagamento? s/n: ");
            String respostaPag = scan.nextLine();
            boolean pagamentoAprovado = respostaPag.equalsIgnoreCase("s");
            
            if (pagamentoAprovado){
                System.out.println("\n---- Liberando Combustivel ----");
                System.out.println("============ RECIBO =============");
                System.out.println("Cliente: " + nomeCliente);
                System.out.println("ombustível: " + tipoCombustivel);
                System.out.printf("Litros: %.2f L%n", quantLitros);
                System.out.printf("Preço/Litro: %.2f MT%n", precoPorLitro);
                System.out.printf("Total: %.2f MT%n", valorTotal);
                System.out.println("Pagamento: " + metodoPagamento);
                System.out.println("==================================");
            }else{
                System.out.println("Operação recusada. Pagamento não aprovado.");
            }
            
            System.out.print("\nQuer Continuar? s/n: ");
            String resposta = scan.nextLine();
            if(resposta.equalsIgnoreCase("n")){
               encerrar = true;
            }
            System.out.println("");
        }
        
        System.out.println("Sistema encerrado.");
        scan.close();
        
        
    }
    
}
