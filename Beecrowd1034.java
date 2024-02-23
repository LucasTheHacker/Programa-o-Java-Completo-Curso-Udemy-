import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int entrada = input.nextInt();
		int contadorAlcool,contadorGasolina,contadorDiesel; 

		contadorAlcool = 0;
		contadorDiesel = 0;
		contadorGasolina = 0;

		while (entrada != 4) {
			switch (entrada) {
				case 1:
					contadorAlcool +=1;
					break;
				case 2:
					contadorGasolina += 1;
					break;
				case 3:
					contadorDiesel += 1;
					break;
				default:
					break;
			}
			entrada = input.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n",contadorAlcool);
		System.out.printf("Gasolina: %d\n",contadorGasolina);
		System.out.printf("Diesel: %d\n",contadorDiesel);
		
		input.close();
}
}
