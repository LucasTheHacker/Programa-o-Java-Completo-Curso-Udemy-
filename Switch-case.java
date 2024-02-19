import java.io.IOException;
//import java.util.Locale;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws IOException {
		System.out.println("Que dia eh hoje?: ");
		Scanner input = new Scanner(System.in);
		
		int inteiro = input.nextInt();
		String dia;

		switch (inteiro) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terca";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default: // corresponde a um else
				dia = "valor invalido";
				break;
		}
		System.out.println("Dia da semana: " + dia);
		input.close();
		
}
}
