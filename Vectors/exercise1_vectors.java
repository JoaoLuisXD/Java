package Vectors;

import java.util.Scanner;

public class exercise1_vectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you wanna type?");
        int n = sc.nextInt();
        int[] numVector = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < numVector.length; i++){
            numVector[i] = sc.nextInt();
        }

        System.out.print("Negative numbers: ");
        for (int i = 0; i < numVector.length; i++) {
            if(numVector[i] < 0){
                System.out.println(numVector[i]);
            }
        }



        sc.close();
    }
}
