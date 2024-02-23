// Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
//Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int horaInicial, minutoInicial, horaFinal, minutoFinal;

		horaInicial = input.nextInt();
		minutoInicial = input.nextInt();
		horaFinal = input.nextInt();
		minutoFinal = input.nextInt();

		int temp, horas, minutos;

		temp = 0;
		horas = 0;
		minutos = 0;

		//caso extremo de 24h
		if (horaFinal == horaInicial && minutoFinal == minutoInicial) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else if (horaInicial == horaFinal && minutoInicial < minutoFinal) { //Mesmo dia e mesma hora
			temp = (horaFinal*60 + minutoFinal) - (horaInicial*60 +minutoInicial);
			horas = (int) temp/60; //CASTING
			minutos = (int) temp%60; //CASTING
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		}
		else if (horaInicial < horaFinal) { //Mesmo dia e horas diferentes
			temp = (horaFinal*60 + minutoFinal) - (horaInicial*60 +minutoInicial);
			horas = (int) temp/60; //CASTING
			minutos = (int) temp%60; //CASTING
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		}
		else { //dias diferentes
			temp = (1440 - (horaInicial*60 + minutoInicial)) + (horaFinal*60 + minutoFinal);
			horas = (int) temp/60; //CASTING
			minutos = (int) temp%60; //CASTING
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		}
		input.close();
}
}
