package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");

        int numEntradas = input.nextInt();

        double[] vetorEntradas = new double[numEntradas];

        for (int i = 0; i < vetorEntradas.length; i++) {
            System.out.print("Digite um numero: ");
            vetorEntradas[i] = input.nextDouble();
        }
        System.out.println("VALORES = " + vetorEntradas);

        double aux = 0.0;

        for (int i = 0; i < vetorEntradas.length; i++) {
            aux += vetorEntradas[i];
        }

        System.out.printf("SOMA = %.2f", aux);

        System.out.printf("MEDIA = %.2f", aux / numEntradas);

        input.close();
    }

}
