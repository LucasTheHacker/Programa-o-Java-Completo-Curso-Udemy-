package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;
public class ProgramTriangle {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);

            Triangulo x, y; //Tipo composto por 3 atributos.
            x = new Triangulo();
            y = new Triangulo();

            System.out.println("Enter the measures of triangle X: "); //Entidade com 3 atributos.
            x.a = input.nextDouble();
            x.b = input.nextDouble();
            x.c = input.nextDouble();   
            double areaX = x.getArea();

            System.out.println("Enter the measures of triangle Y: "); //Entidade com 3 atributos.
            y.a = input.nextDouble();
            y.b = input.nextDouble();
            y.c = input.nextDouble();   
            double areaY = y.getArea();  

            input.close();

            System.out.printf("Triangle X area: %.4f\n", areaX);
            System.out.printf("Triangle Y area: %.4f\n", areaY);
            
            if (x.getArea() > y.getArea()) {
                System.out.println("Higher Area = X");
            }
            else {
                System.out.println("Higher Area = Y");
            }
        }
    
}
