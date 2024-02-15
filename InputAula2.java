//Como ler dados até a quebra de linha (enter)
//QUEBRA DE LINHA, LEITURA INPUT ETC.
package dr.lucas.batista.codigosjava;

import java.util.Locale;
import java.util.Scanner;

public class InputAula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		String var1, var2, var3, vazio;
		int x;
		
		x = input.nextInt();
		vazio = input.nextLine(); //consome a quebra de linha pendente do nextInt acima. (Buffer de leitura)
		var1 =  input.nextLine(); 
		var2 =  input.nextLine();
		var3 =  input.nextLine();
		
		System.out.println("Dados digitados até a quebra de linha: ");
		System.out.println(x);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		input.close();
    }
    
}
