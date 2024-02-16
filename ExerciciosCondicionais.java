package dr.lucas.batista.codigosjava;

import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero e veja se ele eh negativo, positivo, par ou impar: ");
        int x = input.nextInt();

        if (x < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        if (x % 2 == 0) { //Se o resto da divisão de x por 2 for igual a zero, então ele é par.
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        System.out.println("Digite dois numeros inteiros e veja se são multiplos entre si:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.println("SAO MULTIPLOS");
            }
            else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }
        else {
            if (num2 % num1 == 0){
                System.out.println("SAO MULTIPLOS");
            }
            else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }

        input.close();
    }
    
}
