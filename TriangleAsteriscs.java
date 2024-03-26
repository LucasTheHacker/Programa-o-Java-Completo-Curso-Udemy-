package application;

//Triangulo Invertido
//Cada linha tem que conter 2n - 1, 2n -3 asteriscos (até 1)
//Cada linha tem que ter 2(n-1) ... 0 espaços
import java.util.Scanner;

public class TriangleAsteriscs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o tamanho do triângulo? ");

        int linhasTrianguloInvertido = scanner.nextInt();
        int contadorDeIteração = 0;

        for (int i = linhasTrianguloInvertido; i > 0; i--) {

            if (contadorDeIteração > 0) {
                for (int j = 0; j < contadorDeIteração; j++) {
                    System.out.print("  ");
                }
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            contadorDeIteração++;
        }
        scanner.close();
    }

}
