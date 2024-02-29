package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculatorApagar;

public class Apagar {
    public static final double PI_NUMBER = 3.14159; //'final' é pra declarar uma constante
    //MEMBRO ESTÁTICO
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculatorApagar calculatorApagar = new CalculatorApagar();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f\n", calculatorApagar.circumference(radius));
        System.out.printf("Volume: %.2f\n", calculatorApagar.volume(radius));
        System.out.println("PI value: 3.14");
        sc.close();

        //Como os métodos da classe Calculator não são estáticos, eu preciso criar um objeto, ou seja, instanciar...
        //pra poder fazer referência dentro de um método estático como é o psvm

        //se os membros fossem estáticos, poderia chamar sem a necessidade de criação de um objeto e, ainda por cima, pelo nome da classe
}
}
