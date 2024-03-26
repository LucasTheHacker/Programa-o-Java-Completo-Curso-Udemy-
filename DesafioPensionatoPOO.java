package application;

import java.util.Scanner;

import entities.PessoaPensionato;

public class DesafioPensionatoPOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");

        int numQuartos = input.nextInt();

        PessoaPensionato[] quartosPensao = new PessoaPensionato[10];

        System.out.println();

        for (int i = 0; i < numQuartos; i++) {
            input.nextLine(); // Limpeza do buffer de leitura
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Room: ");
            int indexQuarto = input.nextInt();

            quartosPensao[indexQuarto] = new PessoaPensionato(name, email);
            System.out.println();
        }

        for (int i = 0; i < quartosPensao.length; i++) {
            if (quartosPensao[i] != null) {
                System.out.println(i + ": " + quartosPensao[i].getName() + ", " + quartosPensao[i].getEmail());
            }

        }

        input.close();
    }

}
