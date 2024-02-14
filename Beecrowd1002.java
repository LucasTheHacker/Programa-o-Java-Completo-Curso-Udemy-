package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Pra aceitar o ponto como separador decimal.

        Scanner input = new Scanner(System.in); //Crio o recurso input.

        double raio = input.nextDouble();

        double area = Math.pow(raio, 2) * 3.14159;

        System.out.printf("A=%.4f\n", area);

        input.close(); //finalizo o recurso de input.
    }
}
