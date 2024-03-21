package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");

        int numPessoas = input.nextInt();

        int[] vectAges = new int[numPessoas];
        String[] vectNames = new String[numPessoas];
        double[] vectHeights = new double[numPessoas];

        for (int i = 0; i < vectAges.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            vectNames[i] = input.next();
            System.out.print("Idade: ");
            vectAges[i] = input.nextInt();
            System.out.print("Altura: ");
            vectHeights[i] = input.nextDouble();
        }
        double aux = 0.0;

        for (int i = 0; i < vectHeights.length; i++) {
            aux += vectHeights[i];
        }
        System.out.printf("\nAltura media: %.2f\n", aux / vectHeights.length);

        aux = 0.0;

        for (int i = 0; i < vectAges.length; i++) {
            if (vectAges[i] < 16) {
                aux++;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", aux / numPessoas);
        for (int i = 0; i < vectAges.length; i++) {
            if (vectAges[i] < 16) {
                System.out.println(vectNames[i]);
            }
        }

        input.close();
    }

}
