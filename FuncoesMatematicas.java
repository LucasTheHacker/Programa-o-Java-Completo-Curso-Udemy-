package dr.lucas.batista.codigosjava;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println(x + " elevado a 1/2 � " + A);
		System.out.println(y + " elevado a 1/2 � " + B);
		System.out.println("25.0" + " elevado a 0.5 � " + C);
		
		A = Math.pow(x, y); //A = x^y
		B = Math.pow(x, 2.0); //B = x^2
		C = Math.pow(5.0, 2.0); //C = 5^25
		System.out.println(x +" elevado a "+ y + " � " + A);
		System.out.println(x +" elevado ao quadrado � " + B);
		System.out.println("5.0 elevado ao quadrado � " + C);
		
		A = Math.abs(y); //A = |y|
		B = Math.abs(z); //A = |y|
		
		System.out.println("O valor absoluto de " + y + " � " + A);
		System.out.println("O valor absoluto de "+ z +" � " + C);
    }
}
