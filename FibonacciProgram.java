package application;

import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.print("Calcule o Fibonacci de: ");
        int entrada = scanner.nextInt();
        int aux = 0;

        int fibonacci = 0;
        if (entrada == 0) {
            System.out.println(a);
        } else if (entrada == 1) {
            System.out.println(b);
        } else {
            System.out.println(a);
            System.out.println(b);
            while (aux != entrada) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
                aux++;
                System.out.println(fibonacci);
            }
        }

        scanner.close();
    }

}
