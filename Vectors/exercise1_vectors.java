package Vectors;

import java.util.Scanner;

public class exercise1_vectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you wanna type?");
        int n = sc.nextInt();
        int[] numVector = new int[n];
        int[] negVector = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < numVector.length; i++){
            numVector[i] = sc.nextInt();
            if(numVector[i] < 0){
                negVector[i] = numVector[i];
            }
        }

        System.out.print("Negative numbers: ");
        for (int i = 0; i < negVector.length; i++) {
            if(negVector[i] < 0){
                System.out.println(negVector[i]);
            }
        }



        sc.close();
    }
}
