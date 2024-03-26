package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovados {

    public static boolean passou(double a, double b) {
        if ((a + b) / 2 >= 6) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int numEntradas = scanner.nextInt();
        String[] vectNames = new String[numEntradas];
        double[] vectNota1oSemestre = new double[numEntradas];
        double[] vectNota2oSemestre = new double[numEntradas];

        for (int i = 0; i < vectNota2oSemestre.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
            String buffer = scanner.nextLine();
            vectNames[i] = scanner.nextLine();
            vectNota1oSemestre[i] = scanner.nextDouble();
            vectNota2oSemestre[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < vectNota2oSemestre.length; i++) {
            if (passou(vectNota1oSemestre[i], vectNota2oSemestre[i])) {
                System.out.println(vectNames[i]);
            }
        }

        scanner.close();
    }

}
