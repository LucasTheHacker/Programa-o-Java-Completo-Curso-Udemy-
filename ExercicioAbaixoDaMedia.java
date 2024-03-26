package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vao ter o vetor? ");

        int numInputs = input.nextInt();
        double sum = 0.0;
        double[] vectDoubles = new double[numInputs];

        for (int i = 0; i < numInputs; i++) {
            System.out.print("Digite um numero: ");
            vectDoubles[i] = input.nextDouble();
            sum += vectDoubles[i];
        }

        System.out.printf("MEDIA DO VETOR = %.3f\n", sum / numInputs);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < vectDoubles.length; i++) {
            if (vectDoubles[i] < sum / numInputs) {
                System.out.println(vectDoubles[i]);
            }
        }

        input.close();
    }

}
