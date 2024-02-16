package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int codigo, quantidade;

        codigo = input.nextInt();
        quantidade = input.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f\n", 4.0 * quantidade);
        }
        if (codigo == 2) {
            System.out.printf("Total: R$ %.2f\n", 4.5 * quantidade);
        }
        if (codigo == 3) {
            System.out.printf("Total: R$ %.2f\n", 5.0 * quantidade);
        }
        if (codigo == 4) {
            System.out.printf("Total: R$ %.2f\n", 2.0 * quantidade);
        }
        if (codigo == 5) {
            System.out.printf("Total: R$ %.2f\n", 1.5 * quantidade);
        }


        input.close();
    }
}
