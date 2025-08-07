package Conditional_structs;

import java.util.Scanner;

public class conditional_exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        }
        else
         System.out.println("Odd");

        sc.close();
    }
    
}
