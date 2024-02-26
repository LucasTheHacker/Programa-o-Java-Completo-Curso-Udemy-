import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //Função entry
	Scanner input = new Scanner(System.in);

	
	System.out.println("Digite 3 numeros: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	int Higher = getHigher(a,b,c);

	showResult(Higher);

	Locale.setDefault(Locale.US);
	input.close();
}	
	public static int getHigher(int x, int y, int z) { //Função/Método que retorna um valor tipo int
		if (x > y && x > z) {
			return x;
		}
		else if (y > z) {
			return y;
		}
		else{
			return z;
		}
	}

	public static void showResult(int x) { //Função que NÃO RETORNA um valor --> VOID!!!
		System.out.println(x);
	}
}
