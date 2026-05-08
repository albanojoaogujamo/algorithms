package TPC;

import java.io.*;

public class TPC01_EquacaoQuadratica {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c;
        System.out.println("Digite os coeficientes a, b e c da equação quadrática ax^2 + bx + c = 0:");

        System.out.print("Introduza o valor de a: ");
        a = Double.parseDouble(br.readLine());

        System.out.print("Introduza o valor de b: ");
        b = Double.parseDouble(br.readLine());

        System.out.print("Introduza o valor de c: ");
        c = Double.parseDouble(br.readLine());

        //Caso 1: 
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("Equação linear. solução: x =" + x);
                
            } else{
                if (c == 0 ) {
                    System.out.println("Equação indeterminada (Infinitas solições).");
                } else{
                    System.out.println("Equação impossivel (sem solução).");
                }
            }
        } else{
            // Caso 2:

        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes são reais e distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("As raízes são reais e iguais:");
            System.out.println("x = " + x);

        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-delta) / (2 * a);

            System.out.println("As raízes são complexas e conjugadas.");
            System.out.println("x1 = " + real + "+" + imag + "i");
            System.out.println("x2 = " + real + "+" + imag + "i");
        }
    }
}
}
