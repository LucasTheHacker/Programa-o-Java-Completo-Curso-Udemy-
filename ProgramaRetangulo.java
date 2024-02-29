package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Enter rectangle widht and height");

        retangulo.width = input.nextDouble();
        retangulo.height = input.nextDouble();

        System.out.printf("AREA = %.2f\n", retangulo.getArea());
        System.out.printf("PERIMETER = %.2f\n", retangulo.getPerimeter());
        System.out.printf("DIAGONAL = %.2f\n ", retangulo.getDiagonal());

        input.close();
    }
}
