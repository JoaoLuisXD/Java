package application;

import java.util.Scanner;

import entities.Employees;

public class EmployeeExercise {
    public static void main(String[] args) {
        Employees emp = new Employees();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        emp.name = sc.nextLine();
        System.out.print("Enter the salary of the employee: ");
        emp.grossSalary =  sc.nextDouble();
        System.out.print("Enter the tax that will be discounted of the salary: ");
        emp.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n",emp.name,emp.netSalary());

        System.out.print("Wich percentage to increase salary: ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);
        System.out.printf("Updated data: %.2f\n", emp.netSalary());


        sc.close();
    }
}
