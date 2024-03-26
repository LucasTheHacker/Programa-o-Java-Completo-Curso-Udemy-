package application;

import java.util.Scanner;

public class ExercicioPares {

    public static void printVetor(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
    }

    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");

        int numEntradas = input.nextInt();
        int[] vectInts = new int[numEntradas];

        int numPares = 0;

        for (int i = 0; i < numEntradas; i++) {
            System.out.print("Digite um numero: ");
            vectInts[i] = input.nextInt();
            if (ehPar(vectInts[i])) {
                numPares++;
            }
        }

        int[] vectPares = new int[numPares];
        int aux = 0;

        for (int i = 0; i < vectInts.length; i++) {
            if (ehPar(vectInts[i])) {
                vectPares[aux] = vectInts[i];
                aux++;
            }
        }

        System.out.println("NUMEROS PARES:");

        printVetor(vectPares);
        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + numPares);

        input.close();
    }
}
