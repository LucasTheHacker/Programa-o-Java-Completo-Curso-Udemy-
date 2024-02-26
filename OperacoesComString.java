//FUNÇÕES INTERESSANTES PRA STRINGS
public class Main {
	public static void main(String[] args) {
		String testeOriginal = "ABCdu TestTE DE funcOESAB    ";

		String v1 = testeOriginal.toLowerCase();
		String v2 = testeOriginal.toUpperCase();
		String v3 = testeOriginal.trim(); //remove espaços nas extremidades.
		String v4 = testeOriginal.substring(3); //do index 3, inclusivo, em diante.
		String v5 = testeOriginal.substring(3, 10); //do 3 ao 10, incluindo o 3 e excluindo o 10
		String v6 = testeOriginal.replace("T", "P");
		String v7 = testeOriginal.replace("AB", "YZ");
		int indice = testeOriginal.indexOf("AB");
		int indiceLast = testeOriginal.lastIndexOf("AB");


		System.out.println("Versao Original: - " + testeOriginal + "-");
		System.out.println("toLowerCase: -" + v1 + "-");
		System.out.println("toUpperCase: -" + v2 + "-");
		System.out.println("trim: -" + v3 + "-");
		System.out.println("substring(3): -" + v4 + "-");
		System.out.println("substring(3,10): -" + v5 + "-");
		System.out.println("replace(T, P): -" + v6 + "-");
		System.out.println("replace(AB, YZ): -" + v7 + "-");
		System.out.println("indexOf: " + indice);
		System.out.println("lastIndexOf: " + indiceLast);

		String frase = "Lucas Gabriel da Silva Batista";

		String[] vetor = frase.split(" "); //Separe com base nos espaços e armazene no vetor de strings "vetor"
		String word0 = vetor[0];
		String word1 = vetor[1];
		String word2 = vetor[2];
		String word3 = vetor[3];
		String word4 = vetor[4];

		System.out.println(word0);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println(word4);

		
}
}
