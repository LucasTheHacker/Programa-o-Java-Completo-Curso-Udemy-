package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        student.name = input.nextLine();
        student.notaTrim1 = input.nextDouble();
        student.notaTrim2 = input.nextDouble();
        student.notaTrim3 = input.nextDouble();

        student.showSituacion();

        input.close();
    }
}
