package dr.lucas.batista.codigosjava;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Crio uma variável do tipo Scanner. Associo ela ao objeto Scanner(System.in). Objetivo é apenas receber os dados.

        String x;

        x = input.next();

        System.out.println("Mar mosso " + x);



        input.close(); //Finalizo o recurso.

    }
    
}
