package dr.lucas.batista.codigosjava;
import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1010 { 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 

        Scanner input = new Scanner(System.in);

        int codigo1 = input.nextInt();
        int quantidade1 = input.nextInt();
        float valor1 = input.nextFloat();
        
        //esses recursos de leitura utilizam o espaço como separação e leem em uma mesma linha
        
        int codigo2 = input.nextInt();
        int quantidade2 = input.nextInt();
        float valor2 = input.nextFloat();
        
        float total = (quantidade1*valor1 + quantidade2*valor2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
  
        
        input.close(); 
}
}
