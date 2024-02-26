import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  throws IOException{
	Scanner input = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	int numEntradas =  input.nextInt();
	int coelhos = 0;
	int ratos = 0;
	int sapos = 0;
	for (int i = 1; i <= numEntradas; i++) {
		
		int numCobaias = input.nextInt();
		char tipoCobaia = input.next().charAt(0);

		switch (tipoCobaia) {
			case 'C':
				coelhos += numCobaias;
				break;
			case 'R':
				ratos += numCobaias;
				break;
			default:
				sapos += numCobaias;
				break;
		}
	}
	double total = coelhos + ratos + sapos;
	double percentualCoelhos = (double) coelhos * 100/total;
	double percentualRatos = (double) ratos * 100/total;
	double percentualSapos = (double) sapos * 100/total;

	System.out.println("Total: " + total + " cobaias");
	System.out.println("Total de coelhos: " + coelhos);
	System.out.println("Total de ratos: " + ratos);
	System.out.println("Total de sapos: " + sapos);

	System.out.printf("Percentual de coelhos: %.2f", percentualCoelhos);
	System.out.println(" %");
	System.out.printf("Percentual de ratos: %.2f", percentualRatos);
	System.out.println(" %");
	System.out.printf("Percentual de sapos: %.2f", percentualSapos);
	System.out.println(" %");

	input.close();
}		
}
