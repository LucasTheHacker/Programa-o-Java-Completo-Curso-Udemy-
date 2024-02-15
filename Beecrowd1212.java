package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1212 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 

        Scanner input = new Scanner(System.in);

        double A, B, C;
        
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f\n", A*C/2);
        System.out.printf("CIRCULO: %.3f\n", Math.pow(C, 2.0)*3.14159); //pi*r^2
        System.out.printf("TRAPEZIO: %.3f\n", (A+B)*C/2);
        System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2.0));
        System.out.printf("RETANGULO: %.3f\n", A*B);
        
        input.close(); 
    }
    
}

