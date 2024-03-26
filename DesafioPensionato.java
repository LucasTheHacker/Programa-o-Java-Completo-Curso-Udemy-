package application;

import java.util.Scanner;

public class DesafioPensionato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");

        int numQuartos = input.nextInt();

        int[] quartos = new int[10];
        String[] vectNames = new String[10];
        String[] vectEmails = new String[10];
        String[] vectNamesCorrespondencia = new String[10];
        String[] vectEmailsCorrespondencia = new String[10];
        int indexQuarto = 0;

        System.out.println();

        for (int i = 0; i < numQuartos; i++) {
            System.out.println("Rent #" + (i + 1));
            input.nextLine(); // Limpeza do Buffer de Leitura
            System.out.print("Name: ");
            vectNames[i] = input.nextLine();
            System.out.print("Email: ");
            vectEmails[i] = input.nextLine();
            System.out.print("Room: ");
            indexQuarto = input.nextInt();

            vectEmailsCorrespondencia[indexQuarto] = vectEmails[i];
            vectNamesCorrespondencia[indexQuarto] = vectNames[i];
            System.out.println();
        }

        Character c = 'F';
        System.out.println(c);

        Boolean t = true;
        System.out.println(t);
        Number cx = 12;
        System.out.println(cx);

        System.out.println("Busy rooms:");
        for (int i = 0; i < vectEmails.length; i++) {
            if (vectNamesCorrespondencia[i] != null) {
                System.out.println(i + ": " + vectNamesCorrespondencia[i] + ", " + vectEmailsCorrespondencia[i]);
            }
        }

        input.close();
    }

}
