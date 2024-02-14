package dr.lucas.batista.codigosjava;

import java.util.Locale;

public class RevisaoSaidaDeDados {

    public static void main(String[] args) {
        
    String produto1 = "Computer";
    String produto2 = "Office Desk";

    int idade = 30;
    int codigo = 5290;
    char genero = 'F';

    double preco1 = 2100.0;
    double preco2 = 650.5;
    double medida = 53.234567;

    System.out.println("Products:");
    System.out.printf("%s, wich price is $ %.2f\n", produto1, preco1);
    System.out.printf("%s, wich price is $ %.2f\n\n", produto2, preco2);
    System.out.printf("Record: %d years old, code %d and gender: %s\n\n", idade, codigo, genero);
    System.out.printf("Measure with eight decimal places: %.8f\n", medida);
    System.out.printf("Rounded (three decimal places): %.3f\n", medida);
    Locale.setDefault(Locale.US); //defino a linguagem pra inglês US pra colocar separador decimal como ponto.
    System.out.printf("US decimal point: %.3f", medida);
    
}

}
