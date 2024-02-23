import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int valor = input.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			System.out.printf("%d %.0f %.0f\n", i,  Math.pow(i,2.0),Math.pow(i,3.0));
		}

		input.close();
}
}
