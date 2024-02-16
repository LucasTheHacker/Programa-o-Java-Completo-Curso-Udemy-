package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        if (valor >= 0 && valor <= 100) {
            if (valor >= 0 && valor <= 25) {
                System.out.println("Intervalo [0,25]");
            }
            if (valor > 25 && valor <= 50) {
                System.out.println("Intervalo (25,50]");
            }
            if (valor > 75 && valor <= 100) {
                System.out.println("Intervalo (75,100]");
            }
        }
        else {
            System.out.println("Fora de intervalo");
        }

        input.close();
    }
    
}
