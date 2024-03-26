package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicaRefazer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numEntradas = input.nextInt();
        double[] vectEntradas = new double[numEntradas];

        for (int i = 0; i < vectEntradas.length; i++) {
            System.out.print("Digite um numero: ");
            vectEntradas[i] = input.nextDouble();
        }

        double maiorNumero = vectEntradas[0];
        int indexMaiorNum = 0;

        for (int i = 0; i < vectEntradas.length; i++) {
            if (vectEntradas[i] >= maiorNumero) {
                maiorNumero = vectEntradas[i];
                indexMaiorNum = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + indexMaiorNum);

        input.close();

        'System.out.printf("Printando porcentade %.2f%%\n", maiorNumero);'
    }
}
