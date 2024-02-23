// Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
//Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x, y;
		x = input.nextInt();
		y = input.nextInt();
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = input.nextInt();
			y = input.nextInt();
		}
		
		input.close();
}
}
