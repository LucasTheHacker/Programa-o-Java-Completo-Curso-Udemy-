package entities;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int intEntrada = input.nextInt();

        while (intEntrada != 0) {
            if (intEntrada % 2 == 0) {
                int soma = 0;
                for (int i = 0; i < 5; i++) {
                    soma += intEntrada;
                    intEntrada += 2;
                }
                System.out.println(soma);
            } else {
                int soma = 0;
                intEntrada++;
                for (int i = 0; i < 5; i++) {
                    soma += intEntrada;
                    intEntrada += 2;
                }
                System.out.println(soma);
            }
            intEntrada = input.nextInt();
        }
        input.close();
    }
}
