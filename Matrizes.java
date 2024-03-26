package application;

//Implementa matriz e percorre a matriz

import java.util.Scanner;

public class MatrizesApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ordemMatriz = scanner.nextInt();
        int[][] matriz = new int[ordemMatriz][ordemMatriz];

        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < ordemMatriz; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        int contaNegativos = 0;
        for (int i = 0; i < ordemMatriz; i++) {
            for (int j = 0; j < ordemMatriz; j++) {
                if (matriz[i][j] < 0) {
                    contaNegativos++;
                }
            }

        }
        System.out.println("Numeros negativos = " + contaNegativos);

        scanner.close();
    }

}
