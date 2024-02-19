import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();

		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario <= 3000.00) {
			double imposto = salario - 2000.00;
			System.out.printf("R$ %.2f\n", imposto*0.08);
		}
		else if (salario <= 4500.00) {
			double imposto = 80 + 0.18*(salario - 3000.00); // 80 é do imposto sobre 1000
			System.out.printf("R$ %.2f\n", imposto);
		}
		else if (salario > 4500.00) {
			double imposto = 80 + 270 + 0.28*(salario - 4500); //270 é do imposto sobre 1500
			System.out.printf("R$ %.2f\n", imposto);
		}
		input.close();
}
}
