package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numEntradas = input.nextInt();

        double[] vectHeights = new double[numEntradas];
        char[] vectGender = new char[numEntradas];

        for (int i = 0; i < vectGender.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            vectHeights[i] = input.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            vectGender[i] = input.next().charAt(0);
        }

        double maiorAltura = vectHeights[0];
        double menorAltura = vectHeights[0];
        int numHomens = 0;
        double somaAlturaMulheres = 0.0;

        for (int i = 0; i < vectHeights.length; i++) {
            if (vectHeights[i] > maiorAltura) {
                maiorAltura = vectHeights[i];
            }
            if (vectHeights[i] < menorAltura) {
                menorAltura = vectHeights[i];
            }
            if (vectGender[i] == 'M') {
                numHomens++;
            }
            if (vectGender[i] == 'F') {
                somaAlturaMulheres += vectHeights[i];
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das Alturas das mulheres = %.2f\n", somaAlturaMulheres / (numEntradas - numHomens));
        System.out.println("Numero de homens: " + numHomens);

        input.close();
    }

}
