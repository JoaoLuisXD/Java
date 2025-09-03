package application;

import java.util.Scanner;

import entities.Student;

public class StudentExercise {
    public static void main(String[] args) {
        Student std = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        std.name = sc.nextLine();
        System.out.println("Enter your three notes below");
        System.out.print("N1-(max: 30) -> ");
        std.n1 = sc.nextDouble();
        System.out.print("N2-(max: 35) -> ");
        std.n2 = sc.nextDouble();
        System.out.print("N3-(max: 35) -> ");
        std.n2 = sc.nextDouble();


        System.out.println("Name: " + std.name);
        System.out.printf("Final Grade: %.2f\n", std.result);
        System.out.printf("Missing %.2f points\n", std.missingPoints);



        sc.close();
    }
}
