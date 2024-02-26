//verifica se o sexto bit de um número é zero ou um.
import java.util.Scanner;
import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		int mascara = 32;
		int mascaraBinario = 0b00100000; //declaro um número binario de um byte -> 0b pra informar que é binário

		if ((n & mascara)== 32)
			System.out.println("O sexto bit eh 1");
		else {System.out.println("O sexto bit eh zero");}

		input.close();
		
}
}
