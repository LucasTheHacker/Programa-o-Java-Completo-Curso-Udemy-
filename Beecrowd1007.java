package dr.lucas.batista.codigosjava;
import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        System.out.println("DIFERENCA = " + (A*B - C*D));
        
        input.close(); 
}
}