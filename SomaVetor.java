package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numInputs = input.nextInt();

        double[] vetorInteiros = new double[numInputs];
        double SomaVetor = 0.0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite um numero: ");
            vetorInteiros[i] = input.nextDouble();
            SomaVetor += vetorInteiros[i];
        }

        System.out.println();

        System.out.print("VALORES = ");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + " ");
        }
        System.out.println();

        System.out.printf("SOMA = %.2f\n", SomaVetor);
        System.out.printf("MEDIA = %.2f", SomaVetor / vetorInteiros.length);

        input.close();
    }
}
