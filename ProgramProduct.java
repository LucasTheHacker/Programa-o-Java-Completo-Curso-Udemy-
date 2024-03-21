package application;

import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numInputs = input.nextInt();

        Product[] vetorDeProdutos = new Product[numInputs];

        for (int i = 0; i < numInputs; i++) {
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            vetorDeProdutos[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < numInputs; i++) {
            soma += vetorDeProdutos[i].getPrice();
        }
        System.out.printf("AVERAGE HEIGHT = %.2f\n", soma / numInputs);
        input.close();

    }
}
