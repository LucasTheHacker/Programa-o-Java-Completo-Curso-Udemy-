package dr.lucas.batista.codigosjava;

import java.util.Scanner;

public class Beecrowd1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Crio o recurso input.

        int a = input.nextInt();

        int b = input.nextInt();
        
        System.out.println("SOMA = " + (a + b));

        input.close(); //finalizo o recurso input.
    }
    
}
