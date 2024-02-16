package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x,y;

        x = input.nextDouble();
        y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else {
            if (x == 0) {
                System.out.println("Eixo Y");
            }
            if (y == 0) {
                System.out.println("Eixo X");
            }
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            }
            if (x > 0 && y < 0) {
                System.out.println("Q2");
            }
            if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            if (x < 0 && y > 0) {
                System.out.println("Q4");
            }
        }
        input.close();
    }
    
}
