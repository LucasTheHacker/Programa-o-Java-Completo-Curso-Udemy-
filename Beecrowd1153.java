//Calcula o fatorial
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entrada = input.nextInt();
		int fatorial = 1;

		for (int i = entrada; i > 0 ; i--) {
			if (entrada == 0) {
				System.out.println(1);
			}
			else{
				fatorial = fatorial * i;
			}
		}

		System.out.println(fatorial);


		input.close();
}
}
