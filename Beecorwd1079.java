import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int numInputs = input.nextInt();

		for (int i = 0; i < numInputs; i++) {
			double valorPeso2 = input.nextDouble();
			double valorPeso3 = input.nextDouble();
			double valorPeso5 = input.nextDouble();
			double mediaPonderada = (valorPeso2*2 + valorPeso3*3 + valorPeso5*5)/10;
			System.out.printf("%.1f\n", mediaPonderada);
		}

		input.close();
}
}
