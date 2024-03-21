package application;

import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int numeroEntradas = input.nextInt();
        int[] vetorEntradas = new int[numeroEntradas];

        for (int i = 0; i < numeroEntradas; i++) {
            System.out.print("Digite um numero: ");
            vetorEntradas[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vetorEntradas.length; i++) {
            if (vetorEntradas[i] < 0) {
                System.out.println(vetorEntradas[i]);
            }
        }
        input.close();
    }

}
