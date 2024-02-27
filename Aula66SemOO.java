//Resolução de problema sem orientação a objetos
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) { 
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the measures of triangule X: ");
		double lado1x = input.nextDouble();
		double lado2x = input.nextDouble();
		double lado3x = input.nextDouble();

		System.out.println("Enter the measures of triangule Y: ");
		double lado1y = input.nextDouble();
		double lado2y = input.nextDouble();
		double lado3y = input.nextDouble();

		double px = (lado1x + lado2x + lado3x)/2;
		double py = (lado1y + lado2y + lado3y)/2;
		double formulaHeronX = Math.sqrt(px*(px-lado1x)*(px-lado2x)*(px-lado3x));
		double formulaHeronY = Math.sqrt(py*(py-lado1y)*(py-lado2y)*(py-lado3y));

		System.out.printf("Triangle X area: %.4f\n", formulaHeronX);
		System.out.printf("Triangle Y area: %.4f\n", formulaHeronY);

		if (formulaHeronX > formulaHeronY) {
			System.out.println("Larger Area: X");
		}
		else {
			System.out.println("Larger Area: Y");
		}
		
		input.close();
	
	}
}
