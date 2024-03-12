package entities;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int numInputs = input.nextInt();

        StringBuilder message = new StringBuilder(readLine(input)); //Object to manipulate strings

        for (int i = 0; i < numInputs; i++) {
            for (int j = 0; j < message.length(); j++) {
                int unicodeChar = message.charAt(j);
                if ((unicodeChar >= 65 && unicodeChar <= 90) || (unicodeChar >= 97 && unicodeChar <= 122)) {
                    char newChar = (char) (unicodeChar + 3); //Casting (explicit conversion) UNICODE TO CHAR
                    message.setCharAt(j, newChar); 
                }
            }
            
            message.reverse();

            int dividedTrunk = message.length() / 2;

            for (int j = dividedTrunk; j < message.length(); j++) { //
                int unicodeChar = message.charAt(j);
                char newChar = (char) (unicodeChar - 1);
                message.setCharAt(j, newChar);
            }

            System.out.println(message);
        }

        input.close();
    }

    public static String readLine(Scanner input) { //Method to read strings whithout bugs
        String line = input.nextLine();
        while (line.isEmpty())
            line = input.nextLine();
        return line;
    }

}
