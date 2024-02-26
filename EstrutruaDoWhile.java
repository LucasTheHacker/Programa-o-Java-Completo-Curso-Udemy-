import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsiusTemp = input.nextDouble();

			double farenheitTemp = celsiusTemp*9/5 + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f\n", farenheitTemp);
			System.out.print("Deseja repetir (s/n)? ");

			resposta = input.next().charAt(0);
		} while (resposta != 'n');

		input.close();
		
}
}
