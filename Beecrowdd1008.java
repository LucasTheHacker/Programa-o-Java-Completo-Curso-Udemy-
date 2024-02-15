package dr.lucas.batista.codigosjava;
import java.util.Scanner;
import java.util.Locale;

public class Beecrowdd1008 { 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int valorHora = input.nextInt();
        double horas = input.nextDouble();
        
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", valorHora*horas);
        
        input.close(); 
}
}