package Vectors;

import java.util.Locale;
import java.util.Scanner;

public class exercise3_vectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people do you wanna type?");
        int n = sc.nextInt();
        String[] nameVector = new String[n];
        int[] ageVector = new int[n];
        double[] heightVector = new double[n];

        double sum = 0;
        double age16 = (double) 0;


        for (int i = 0; i < heightVector.length; i++) {
            System.out.println( n + " person data");
            System.out.print("name:");
            nameVector[i] = sc.next();
            System.out.print("age: ");
            ageVector[i] = sc.nextInt();
            System.out.print("height: ");
            heightVector[i] = sc.nextDouble();

            sum += heightVector[i];

            if (ageVector[i] < 16) {
                age16 ++;
            }
        }

        System.out.println("Avarage Height: " + sum / n);


        System.out.println("People under the age of 16: " + ((double) age16 / n) * 100.0 + "%");
        for (int i = 0; i < heightVector.length; i++) {
            if (ageVector[i] < 16) {
                System.out.println(nameVector[i]);
            }
        }

        sc.close();
    }
}
