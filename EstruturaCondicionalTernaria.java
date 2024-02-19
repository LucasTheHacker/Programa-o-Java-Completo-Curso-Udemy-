import java.io.IOException;
//import java.util.Locale;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws IOException {
		System.out.println("Que dia eh hoje?: ");
		Scanner input = new Scanner(System.in);
		double preco = 34.5;
		//double preco = input.nextDouble();
		double desconto;
		if (preco < 20) { //Se for menor que 20, o desconto é de 10%
			desconto = preco * 0.10;
		}
		else {
			desconto = preco * 0.05; //Se for maior que 20, o desconto é de 5%
		}
		System.out.println(desconto);

		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		input.close();
		
}
}
