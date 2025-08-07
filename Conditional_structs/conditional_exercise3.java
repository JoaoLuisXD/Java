package Conditional_structs;

import java.util.Scanner;

public class conditional_exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0)
        {
            System.out.println("are multiple");
        }
        else 
            System.out.println("are not multiple");
        sc.close();;
    }
}
