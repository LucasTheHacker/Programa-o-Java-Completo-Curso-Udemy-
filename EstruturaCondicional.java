package dr.lucas.batista.codigosjava;
//Estrutura condicional
//Com um comando só,as chaves são opcionais no if e/ou no else
import java.util.Scanner;

public class EstruturaCondicional { 

	public static void main(String[] args) {
		System.out.println("Que horas são?");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if (x >= 0 && x < 5 )  
			System.out.println("Boa madrugada!");
		else if (x >= 5 && x < 12) 
			System.out.println("Bom dia, my jovem!");
		else if (x >= 12 && x < 18) 
			System.out.println("Boa tarde, eitaladapa!");
		else 
			System.out.println("Boa noite, é o que resta");
		
		//Versão com chaves e endentação!
		
		System.out.println("De zero a dez, quanto de dor?");
		int y = input.nextInt();
		
		if (y > 5) {
			System.out.println("Muita dor");
		}
		else {
			if (y == 1) {
				System.out.println("dor muito leve");
			}
			else {
				System.out.println("Dor moderada");
			}
		}
				
	
		
		input.close();
}
}