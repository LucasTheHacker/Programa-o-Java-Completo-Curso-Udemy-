package application;

import java.util.Scanner;

public class ExercicioSomaVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vao ter em cada vetor? ");

        int numInputs = input.nextInt();

        int[] vectA = new int[numInputs];
        int[] vectB = new int[numInputs];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = input.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < numInputs; i++) {
            System.out.println(vectA[i] + vectB[i]);
        }

        input.close();
    }
}
