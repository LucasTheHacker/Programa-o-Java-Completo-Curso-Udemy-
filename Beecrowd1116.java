import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int numInputs = input.nextInt();

		for (int i = 0; i < numInputs; i++) {
			int valor1 = input.nextInt();
			int valor2 = input.nextInt();
			double divisao = (double) valor1/valor2;
			if (valor2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f\n", divisao);
			}
		}

		input.close();
}
}
