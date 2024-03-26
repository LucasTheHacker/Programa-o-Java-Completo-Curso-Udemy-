package application;

import java.util.Scanner;

public class ExercicioMediaPares {

    public static boolean ehPar(int teste) {
        if (teste % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int numEntradas = sc.nextInt();
        int[] vectEntradas = new int[numEntradas];

        int numPares = 0;
        int somaPares = 0;

        for (int i = 0; i < vectEntradas.length; i++) {
            System.out.print("Digite um numero: ");
            vectEntradas[i] = sc.nextInt();

            if (ehPar(vectEntradas[i])) {
                numPares++;
                somaPares += vectEntradas[i];
            }
        }

        if (numPares > 0) {
            System.out.println("MEDIA DOS PARES = " + somaPares / numPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }

}
