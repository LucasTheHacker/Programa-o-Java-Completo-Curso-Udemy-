//Calcula o tempo de jogo em horas.

package dr.lucas.batista.codigosjava;

import java.util.Scanner;

public class Beecrowd1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt();
        int fim = input.nextInt();

        if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else {
            if (inicio < fim) { //Comecei a jogar e terminei no mesmo dia
                System.out.printf("O JOGO DUROU %d HORA(S)\n", (fim-inicio));
            }
            else {
                System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - inicio + fim));
            }
        }
    }
}
