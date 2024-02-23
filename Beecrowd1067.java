//Mostra os valores ímpares até o input
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor = input.nextInt();
		int impar = 1;
		for (int i = 1; i <= valor ; i+= 2) {
			System.out.println(impar);
			impar += 2;
		}
		
		input.close();
}
}
