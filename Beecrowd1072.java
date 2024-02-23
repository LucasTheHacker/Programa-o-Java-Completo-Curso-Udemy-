//Mostra os valores ímpares até o input
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numInputs = input.nextInt();
		int valoresIn, valoresOut;

		valoresIn = 0;
		valoresOut = 0;

		for (int i = 0; i < numInputs; i++) {
			Long valor = input.nextLong();
			if (valor >= 10 && valor <= 20) {
				valoresIn++;
			}
			else{
				valoresOut++;
			}
			
		}
		System.out.println(valoresIn + " in");
		System.out.println(valoresOut + " out");
		input.close();
}
}
