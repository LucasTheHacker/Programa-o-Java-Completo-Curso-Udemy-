import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Calcule a soma de: ");

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x; //Incremento x à variável soma por meio de atribuição cumulativa
			x = sc.nextInt();
		}
		
		System.out.println("A soma eh igual a: " + soma);

		System.out.println("Digite um numero inteiro: ");

		int dia = sc.nextInt();
		
		String semanal;
		switch (dia) {
			case 1:
				semanal = "Domingo";
				break;
			case 2:
				semanal = "Segunda";
				break;
			default:
				semanal = "Qualquer dia menos domingo e segundo";
				break;
		}
		System.out.println("O dia da semana eh: " + semanal);
		
		sc.close();
}
}
