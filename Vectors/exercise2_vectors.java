package Vectors;

import java.util.Scanner;

public class exercise2_vectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you wanna type?");
        int n = sc.nextInt();
        double[] numVector = new double[n];
        double sum = 0;

        System.out.println("Enter " + n + " number:");
        for (int i = 0; i < numVector.length; i++) {
            numVector[i] = sc.nextDouble();
            sum += numVector[i];
        }

        System.out.println("numbers:");
        for (int i = 0; i < numVector.length; i++) {
            System.out.println(numVector[i]);
        }
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Avarage of the numbers: " + sum/n);

        sc.close();
    }
}
