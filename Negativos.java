package application;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int numInputs = input.nextInt();
        int[] vetorInteiros = new int[numInputs];

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite um numero: ");
            vetorInteiros[i] = input.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vetorInteiros.length; i++) {
            if (vetorInteiros[i] < 0) {
                System.out.println(vetorInteiros[i]);
            }
        }
        input.close();
    }

}
