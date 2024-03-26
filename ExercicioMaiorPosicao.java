package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int numeroInputs = input.nextInt();
        double[] vectNumeros = new double[numeroInputs];

        for (int i = 0; i < numeroInputs; i++) {
            System.out.print("Digite um numero: ");
            vectNumeros[i] = input.nextDouble();
        }

        double maiorNum = vectNumeros[0];
        int indexMaiorvalor = 0;

        for (int i = 0; i < vectNumeros.length; i++) {
            if (vectNumeros[i] >= maiorNum) {
                maiorNum = vectNumeros[i];
                indexMaiorvalor = i;
            }

        }

        System.out.printf("MAIOR VALOR = %.2f\n", maiorNum);
        System.out.println("POSICAO DO MAIOR VALOR = " + indexMaiorvalor);

        input.close();
    }

}
