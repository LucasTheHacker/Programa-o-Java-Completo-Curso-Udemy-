package application;

import java.util.Scanner;

public class ExercicioMaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int numEntradas = scanner.nextInt();

        String[] vectNames = new String[numEntradas];
        int[] vectAges = new int[numEntradas];

        for (int i = 0; i < vectNames.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa");

            System.out.print("Nome: ");
            vectNames[i] = scanner.next();

            System.out.print("Idade: ");
            vectAges[i] = scanner.nextInt();
        }

        int maisVelho = 0;
        int indexOfMaisVelho = 0;

        for (int i = 0; i < vectAges.length; i++) {
            if (vectAges[i] >= maisVelho) {
                maisVelho = vectAges[i];
                indexOfMaisVelho = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + vectNames[indexOfMaisVelho]);

        scanner.close();
    }
}
