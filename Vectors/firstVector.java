package Vectors;

import java.util.Locale;
import java.util.Scanner;

public class firstVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number how many heights you want to add: ");
        int n = sc.nextInt();
        float[] heightVector = new float[n];
        float addHeight = 0;

        System.out.println("Enter the height of " + n + " people");
        for (int i = 0; i < heightVector.length; i++) 
        {
            heightVector[i] = sc.nextFloat();
            addHeight += heightVector[i];
        }

        float avg = addHeight / n;

        System.out.println("Avarage height: " + avg);

        sc.close();
    }
}
