package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ExercicioListasEmpregado;

public class ExercicioListas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<ExercicioListasEmpregado> listEmpregados = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numEmployees = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            ExercicioListasEmpregado empregado = new ExercicioListasEmpregado();

            System.out.print("Id: ");
            empregado.setId(scanner.nextInt());
            scanner.nextLine(); // Limpeza do buffer de leitura

            System.out.print("Name: ");
            empregado.setName(scanner.nextLine());

            System.out.print("Salary: ");
            empregado.setSalary(scanner.nextDouble());

            listEmpregados.add(empregado);
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = scanner.nextInt();

        boolean situation = false;

        for (ExercicioListasEmpregado empregado : listEmpregados) {
            if (empregado.getId() == idToIncrease) {
                situation = true;
                break;
            } else {
                situation = false;
            }
        }
        if (situation == true) {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            for (ExercicioListasEmpregado empregado : listEmpregados) {
                if (empregado.getId() == idToIncrease) {
                    empregado.increaseSalary(percentage);
                }
            }

        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("----------------------------------");
        System.out.println("List of employees:");

        for (ExercicioListasEmpregado empregado : listEmpregados) {
            System.out.print(empregado.printEmployee());
        }
        scanner.close();
    }

}
