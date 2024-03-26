package entities;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numInputs = input.nextInt();

        String[] names = new String[numInputs];
        double[] prices = new double[numInputs];

        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
            prices[i] = input.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        System.out.printf("AVERAGE PRICE = %.2f\n", sum / numInputs);

        input.close();
    }
}
