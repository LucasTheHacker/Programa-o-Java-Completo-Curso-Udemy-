package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramaEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        employee.tax = input.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s, $ %.2f\n\n", employee.name, employee.netSalary());

        System.out.print("Wich percentage to increase salary? ");
        double percentage = input.nextDouble();
        System.out.println();

        System.out.printf("Updated data: %s, $ %.2f\n", employee.name, employee.increaseSalary(percentage));



        input.close();
    }
}
